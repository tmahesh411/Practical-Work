/*
Q74. Write a java program to print this pattern.
1
2 3 2
3 4 5 4 3
4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
*/
public class pattern74 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            int val = i;

            // Increasing phase
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val++;
            }

            // Decreasing phase
            val -= 2; 
            for (int j = 1; j < i; j++) {
                System.out.print(val + " ");
                val--;
            }

            // Move to the next line
            System.out.println();
        }
    }
}
