/*
Q62. Write a java program to print this pattern.

	1
	2	*	2
	3	*	3	*	3
	4	*	4	*	4	*	4
	3	*	3	*	3
	2	*	2
	1

*/

public class pattern62 {
    public static void main(String x[]) {

        int k = 1;
 
        for (int i = 1; i <= 7; i++) {

            for (int j = 1; j <= 2 * k - 1 ; j++) {

                if (j % 2 == 1) {
                    System.out.printf("%d\t", k);
                } else {
                    System.out.printf("*\t");
                }
            }

            System.out.printf("\n");

            if (i < 4) {
                k++;
            } else {
                k--;
            }
        }
    }
}
