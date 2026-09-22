/*
Q60. Write a java program to print this pattern.

					1
				2		2
			3				3
		4						4
	5								5
		4						4
			3				3
				2		2
					1


*/

public class pattern60 {
    public static void main(String[] args) {
        // Part 1: Top Half (Rows 1 to 5)
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 6 - i || j == 4 + i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Part 2: Bottom Half (Rows 4 down to 1)
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 9; j++) {
                if (j == 6 - i || j == 4 + i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
