/*Q7. Write a java program to print this pattern.

*****
 ****
  ***
   **
    *

*/

public class pattern7{
	public static void main(String x []){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i<=  j){
					System.out.printf("*");
				}else{
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}
	}
}