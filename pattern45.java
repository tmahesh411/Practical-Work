/* Q45. Write a java program to print this pattern.

	*		*		*		*
	*		*		*		*
	*	*	*	*	*	*	*
	*						*
	*						*
	*						*
	*	*	*	*	*	*	*
*/
public class pattern45
{
	public static void main(String x [])
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(i==3||i==7||j==1||j==7||(j%2!=0&&i<=3))
				{	
					System.out.printf("* ");
				}else{
					System.out.printf("  ");
				}
			}
			System.out.printf("\n");
		}
	}
}