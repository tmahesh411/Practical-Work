/*
Q40. Write a java program to print this pattern.

*    *    *
 *   *   *
  *  *  *
   * * *
    ***
***********
    ***
   * * *
  *  *  *
 *   *   *
*    *    *

*/

public class pattern40
{
	public static void main(String x [])
	{
		for(int i=1;i<=11;i++)
		{
			for(int j=1;j<=11;j++)
			{
				if(i==6||j==6||i==j||j==12-i)
				{	
					System.out.printf("*");
				}else{
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}
	}
}