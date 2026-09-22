/*

Q19. Write a java program to print this pattern.

	*						*
	*	*				*	*
	*		*		*		*
	*			*			*
	*		*		*		*
	*	*				*	*
	*						*

*/

public class pattern19 {
    public static void main(String[] args) {
        

        for (int i = 1; i <= 7; i++) {

            for (int j = 1; j <= 7;j++) {

                if (j==1||j==7||j==i||j==8-i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}