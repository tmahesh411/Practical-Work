import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class CarromGame extends JPanel implements ActionListener, MouseListener, MouseMotionListener {
    
    // Physics and Board Configurations
    private final int BOARD_SIZE = 600;
    private final int BORDER = 40;
    private final float FRICTION = 0.988f;
    private final float RESTITUTION = 0.85f; // Elasticity of bounces

    // Game Entities
    private Ball striker;
    private final ArrayList<Ball> coins = new ArrayList<>();
    private final ArrayList<Point> pockets = new ArrayList<>();

    // Mouse Interaction State
    private Point mouseDragStart = null;
    private Point currentMousePos = null;
    private boolean isAiming = false;

    public CarromGame() {
        // Initialize pockets coordinates
        int pOffset = BORDER + 15;
        pockets.add(new Point(pOffset, pOffset));
        pockets.add(new Point(BOARD_SIZE - pOffset, pOffset));
        pockets.add(new Point(pOffset, BOARD_SIZE - pOffset));
        pockets.add(new Point(BOARD_SIZE - pOffset, BOARD_SIZE - pOffset));

        resetGame();

        // Register Input Listeners
        addMouseListener(this);
        addMouseMotionListener(this);

        // Game Loop: ~60 FPS
        Timer timer = new Timer(16, this);
        timer.start();
    }

    private void resetGame() {
        // Create Striker on the bottom baseline
        striker = new Ball(BOARD_SIZE / 2, BOARD_SIZE - BORDER - 50, 22, Color.RED, 2.0f);
        coins.clear();

        // Layout Carrom Coins in a central cluster
        float centerX = BOARD_SIZE / 2f;
        float centerY = BOARD_SIZE / 2f;
        float r = 15; // Coin radius

        // Center Queen (Pink)
        coins.add(new Ball(centerX, centerY, r, new Color(255, 20, 147), 1.0f));

        // Surrounding layout angles
        float[] angles = {0, 60, 120, 180, 240, 300};
        for (int i = 0; i < angles.length; i++) {
            double rad = Math.toRadians(angles[i]);
            float cx = (float) (centerX + (r * 2.1) * Math.cos(rad));
            float cy = (float) (centerY + (r * 2.1) * Math.sin(rad));
            Color c = (i % 2 == 0) ? Color.WHITE : Color.BLACK;
            coins.add(new Ball(cx, cy, r, c, 1.0f));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 1. Physics Step: Move items & check wall bounces
        striker.update(FRICTION, BORDER, BOARD_SIZE - BORDER);
        for (Ball coin : coins) {
            coin.update(FRICTION, BORDER, BOARD_SIZE - BORDER);
        }

        // 2. Collision Step: Resolve circle-to-circle bumps
        for (int i = 0; i < coins.size(); i++) {
            striker.checkCollision(coins.get(i), RESTITUTION);
            for (int j = i + 1; j < coins.size(); j++) {
                coins.get(i).checkCollision(coins.get(j), RESTITUTION);
            }
        }

        // 3. Score Step: Check if anything fell into pockets
        checkPockets();

        // 4. Draw Step
        repaint();
    }

    private void checkPockets() {
        int pocketRadius = 25;
        // Check coins
        for (int i = coins.size() - 1; i >= 0; i--) {
            Ball c = coins.get(i);
            for (Point p : pockets) {
                if (Math.hypot(c.x - p.x, c.y - p.y) < pocketRadius) {
                    coins.remove(i);
                    break;
                }
            }
        }
        // Check striker foul
        for (Point p : pockets) {
            if (Math.hypot(striker.x - p.x, striker.y - p.y) < pocketRadius) {
                striker.x = BOARD_SIZE / 2;
                striker.y = BOARD_SIZE - BORDER - 50;
                striker.vx = 0;
                striker.vy = 0;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Outer Wooden Frame
        g2d.setColor(new Color(110, 64, 34));
        g2d.fillRect(0, 0, BOARD_SIZE, BOARD_SIZE);

        // Plywood Surface
		
        g2d.setColor(new Color(243, 216, 172));
        g2d.setColor(new Color(243, 216, 172));
        g2d.fillRect(BORDER, BORDER, BOARD_SIZE - (BORDER * 2), BOARD_SIZE - (BORDER * 2));

        // Center Circles
        g2d.setColor(new Color(160, 82, 45));
        g2d.drawOval(BOARD_SIZE / 2 - 40, BOARD_SIZE / 2 - 40, 80, 80);
        g2d.drawOval(BOARD_SIZE / 2 - 10, BOARD_SIZE / 2 - 10, 20, 20);

        // Baselines
        g2d.setColor(Color.DARK_GRAY);
        g2d.drawLine(BORDER + 40, BOARD_SIZE - BORDER - 50, BOARD_SIZE - BORDER - 40, BOARD_SIZE - BORDER - 50);

        // Corner Pockets
        g2d.setColor(new Color(20, 20, 20));
        for (Point p : pockets) {
            g2d.fillOval(p.x - 22, p.y - 22, 44, 44);
        }

        // Draw Coins
        for (Ball coin : coins) {
            coin.draw(g2d);
        }

        // Draw Striker
        striker.draw(g2d);

        // Draw Aiming Guide Vector Vector
        if (isAiming && mouseDragStart != null && currentMousePos != null) {
            g2d.setColor(Color.GREEN);
            g2d.setStroke(new BasicStroke(2));
            g2d.drawLine((int) striker.x, (int) striker.y, 
                         (int) (striker.x + (mouseDragStart.x - currentMousePos.x)), 
                         (int) (striker.y + (mouseDragStart.y - currentMousePos.y)));
        }
    }

    // --- MOUSE INPUT EVENTS FOR USER DRAG ---
    @Override
    public void mousePressed(MouseEvent e) {
        // Verify user clicked near the striker
        if (Math.hypot(e.getX() - striker.x, e.getY() - striker.y) < striker.radius * 2) {
            if (striker.vx == 0 && striker.vy == 0) { // Only shoot when stationary
                mouseDragStart = e.getPoint();
                currentMousePos = e.getPoint();
                isAiming = true;
            }
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (isAiming) {
            currentMousePos = e.getPoint();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (isAiming && mouseDragStart != null) {
            // Velocity scales based on drag distance
            float dx = mouseDragStart.x - e.getX();
            float dy = mouseDragStart.y - e.getY();
            
            striker.vx = dx * 0.15f; // Power scaling multiplier
            striker.vy = dy * 0.15f;
        }
        isAiming = false;
        mouseDragStart = null;
        currentMousePos = null;
    }

    @Override public void mouseClicked(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}
    @Override public void mouseMoved(MouseEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Playable Carrom Board System");
        CarromGame panel = new CarromGame();
        frame.add(panel);
        frame.setSize(616, 639);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}

// Inner support class managing standalone game objects
class Ball {
    float x, y, vx, vy, radius, mass;
    Color color;

    public Ball(float x, float y, float radius, Color color, float mass) {
        this.x = x; this.y = y; this.radius = radius; this.color = color; this.mass = mass;
    }

    public void update(float friction, int minBound, int maxBound) {
        x += vx; y += vy;
        vx *= friction; vy *= friction;

        if (Math.abs(vx) < 0.05f) vx = 0;
        if (Math.abs(vy) < 0.05f) vy = 0;

        // Cushion Boundaries Elastic Collisions
        if (x - radius < minBound) { x = minBound + radius; vx = -vx; }
        if (x + radius > maxBound) { x = maxBound - radius; vx = -vx; }
        if (y - radius < minBound) { y = minBound + radius; vy = -vy; }
        if (y + radius > maxBound) { y = maxBound - radius; vy = -vy; }
    }

    public void checkCollision(Ball other, float restitution) {
        float dx = other.x - this.x;
        float dy = other.y - this.y;
        float distance = (float) Math.hypot(dx, dy);
        float minDist = this.radius + other.radius;

        if (distance < minDist) {
            // Fix overlapping bodies manually
            float overlap = minDist - distance;
            float nx = dx / distance;
            float ny = dy / distance;

            this.x -= nx * overlap * 0.5f;
            this.y -= ny * overlap * 0.5f;
            other.x += nx * overlap * 0.5f;
            other.y += ny * overlap * 0.5f;

            // Vector math to apply normal momentum mechanics
            float kx = this.vx - other.vx;
            float ky = this.vy - other.vy;
            float p = 2 * (nx * kx + ny * ky) / (this.mass + other.mass);

            this.vx -= p * other.mass * nx * restitution;
            this.vy -= p * other.mass * ny * restitution;
            other.vx += p * this.mass * nx * restitution;
            other.vy += p * this.mass * ny * restitution;
        }
    }

    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillOval((int)(x - radius), (int)(y - radius), (int)(radius * 2), (int)(radius * 2));
        g.setColor(Color.DARK_GRAY);
        g.drawOval((int)(x - radius), (int)(y - radius), (int)(radius * 2), (int)(radius * 2));
    }
}
