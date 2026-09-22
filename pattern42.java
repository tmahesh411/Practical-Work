/*
Q42. Write a java program to print this pattern.

	*	*	*	*	*	*	*
		*					*
			*				*
				*			*
			*		*		*
		*				*	*
	*						*


*/
public class pattern42
{
	public static void main(String x [])
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(i==1||j==7||i==j||(j==8-i&&j<4))
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