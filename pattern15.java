/*
Q15. Write a java program to print this pattern.

		*	*	*	*	*
		*	#	#	#	*
		*	#	#	#	*
		* 	#	#	#	*
		*	*	*	*	*

*/

public class pattern15{
	public static void main(String x []){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==1 || i==5 || j==1 || j==5)

				{
					System.out.printf("*");
				}else{
					System.out.printf("#");
				}
			}
			System.out.println();
		}
	}
}