/*Q1. Write a java program to print this pattern.
	
	*	*	*	*	*
	*	*	*	*	*
	*	*	*	*	*
	*	*	*	*	*
	*	*	*	*	*
*/
public class NestForLoop
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				
					System.out.printf("* ");
				
			}System.out.printf("\n");
		}
	}
}