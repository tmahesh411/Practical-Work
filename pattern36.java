/*

Q36. Write a java program to print this pattern.

*
**
* *
*  *
*   *
******
*   *
*  *
* *
**
*


*/
public class pattern36
{
	public static void main(String x [])
	{
		for(int i=1;i<=11;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(j==1||i==6||j==i||j==12-i)
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