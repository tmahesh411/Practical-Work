import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarromPiece extends JPanel implements ActionListener {
    // Piece properties
    private float x = 250, y = 350; // Initial position
    private float vx = 15, vy = -12; // Initial velocity/push
    private final float radius = 15;
    private final float friction = 0.985f; // Friction slows it down
    private final int boardSize = 500;

    public CarromPiece() {
        // Game loop timer: updates positions every 16 milliseconds (~60 FPS)
        Timer timer = new Timer(1, this);
        timer.start();
    }

    // This handles the game physics calculations
    @Override
    public void actionPerformed(ActionEvent e) {
        // 1. Move the piece
        x += vx;
        y += vy;

        // 2. Apply friction
        vx *= friction;
        vy *= friction;

        // Stop completely if moving incredibly slow
        if (Math.abs(vx) < 0.1f) vx = 0;
        if (Math.abs(vy) < 0.1f) vy = 0;

        // 3. Wall collisions (Bounce off borders)
        if (x - radius < 30) {        // Left border
            x = 30 + radius;
            vx = -vx;
        }
        if (x + radius > boardSize - 30) { // Right border
            x = boardSize - 30 - radius;
            vx = -vx;
        }
        if (y - radius < 30) {        // Top border
            y = 30 + radius;
            vy = -vy;
        }
        if (y + radius > boardSize - 30) { // Bottom border
            y = boardSize - 30 - radius;
            vy = -vy;
        }

        // 4. Force screen redraw
        repaint();
    }

    // This handles rendering the visual graphics
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw wooden outer frame
        g2d.setColor(new Color(101, 67, 33));
        g2d.fillRect(0, 0, boardSize, boardSize);

        // Draw inner board surface
        g2d.setColor(new Color(245, 222, 179));
        g2d.fillRect(30, 30, boardSize - 60, boardSize - 60);

        // Draw 4 corner pockets
        g2d.setColor(Color.BLACK);
        g2d.fillOval(35, 35, 30, 30);                         // Top-Left
        g2d.fillOval(boardSize - 65, 35, 30, 30);              // Top-Right
        g2d.fillOval(35, boardSize - 65, 30, 30);              // Bottom-Left
        g2d.fillOval(boardSize - 65, boardSize - 65, 30, 30);  // Bottom-Right

        // Draw the moving Striker piece
        g2d.setColor(Color.RED);
        g2d.fillOval((int)(x - radius), (int)(y - radius), (int)(radius * 2), (int)(radius * 2));
    }

    // The Main entry point required to run the Java program
    public static void main(String[] args) {
        JFrame frame = new JFrame("Carrom Board Physics Simulation");
        CarromPiece gamePanel = new CarromPiece();
        
        frame.add(gamePanel);
        frame.setSize(516, 539); // Adjusted size to account for window borders
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
