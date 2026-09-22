/*Q25. Write a java program to print this pattern.

	*	*	*	*	*	*	*	*	*
	*	*	*	*		*	*	*	*
	*	*	*				*	*	*
	*	*						*	*
	*								*
	*                               *
	*	*						*	*
	*	*	*				*	*	*
	*	*	*	*		*	*	*	*
	*	*	*	*	*	*	*	*	*
*/
public class pattern25b{
	public static void main(String x []){
		for(int i=1;i<=10;i++){
			for(int j=1;j<=9;j++){
			
			if(j<=6-i||j<=i-5||j>=4+i||j>=15-i)
			{
				System.out.printf("* ");
				}else{
				System.out.printf("  ");
				}
			}
			System.out.println();
		}
	}
}