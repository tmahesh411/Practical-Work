/*
Q69. Write a java program to print this pattern.

					1
				1	2	1	
            1	2	3	2	1
		1	2	3	4	3	2	1
			1	2	3	2	1	
				1	2	1	
					1

*/
public class pattern69 {
    public static void main(String[] args) {
        int n = 4; // Maximum number in the middle row

        // 1. Upper half of the diamond (Rows 1 to 4)
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); 
            }
            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // 2. Lower half of the diamond (Rows 5 to 7)
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

