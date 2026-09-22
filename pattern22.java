/*

Q22. Write a java program to print this pattern.

			*
		  *   *
		*	*	*
	  *   *   *   *
	*	*	*	*	*

*/

public class pattern22{
	public static void main(String x[]){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if(j>=6-i&&j<=4+i&&(i+j)%2==0)
				{
															// if((i+j)%2!=0)
															// {
																// System.out.printf("  ");
															// }else
															// {
					System.out.printf("* ");
															//}
				}else{
					System.out.printf("  ");
				}
			}
			
			System.out.println();
		}
	}
}