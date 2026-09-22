/*

	Q21. Write a java program to print this pattern.

	*	*	*	*	*
	  *	 		  *
		*       *
		  *   *
			*  
	


*/

public class pattern21 {
    public static void main(String[] args) {
        

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 9;j++) {

                if (i==j||j==10-i) {
					System.out.printf("* ");
					
					}else if(i==1&&(i+j)%2==0){
						
					 System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}