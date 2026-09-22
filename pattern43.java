/*
Q43. Write a java program to print this pattern.

*     * * * *
*     *
*     *
* * * * * * *
      *     *
      *     *
* * * *     *

*/

public class pattern43
{
	public static void main(String x [])
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(i==4||j==4||(j==1&&i<=4)||(j==7&&i>=4)||(i==1&&j>=4)||(i==7&&j<=4))
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