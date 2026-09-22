/*

Q38. Write a java program to print this pattern.
1 2 3 4 5 6 7 8 9 
*               * 1 
* *          *  * 2
*   *       *   * 3
*     *   *     * 4
*       *       * 5

*/

public class pattern38
{
	public static void main(String x [])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j==1||j==9||j==i||j==10-i)
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