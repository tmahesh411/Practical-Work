/*
Q39. Write a java program to print this pattern.
12345678910		i   j
* * * * *  1    1   6
 * * * * * 2	2   1
* * * * *  3    3   6 
 * * * * * 4    4   1
* * * * *  5    5   6

*/
public class pattern39
{
	public static void main(String x [])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if((i+j)%2==0)
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