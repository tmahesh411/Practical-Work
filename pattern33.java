/*
Q33. Write a java program to print this pattern.
	*								*
	*	*						*	*
	*	*	*				*	*	*
	*	*	*	*		*	*	*	*
	*	*	*	*	*	*	*	*	*		   
	*	*	*	*		*	*	*	*
	*	*	*				*	*	*
	*	*						*	*
	*								*

*/
public class pattern33{
	public static void main(String x []){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
			
			if(j <= i || j >= 10-i)  //j <= i || j >= 10-i  ||  j<=i||j>=10-i
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