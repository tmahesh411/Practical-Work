/*
Q48. Write a java program to print this pattern.

	1
	2	3
	4	5	6
	7	8	9	10
	11	12	13	14	15

*/
public class pattern48
{
	public static void main(String x [])
	{
		int count=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
					System.out.printf("%d\t",  count);
					count++;
			}
			System.out.printf("\n");
		}
	}
}