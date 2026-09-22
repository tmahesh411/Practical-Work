/*
Q56. Write a java program to print this pattern.

	1	2	3	4	5
	6	7	8	1	2
	3	4	5	6	7
	8	1	2	3	4	
	5	6	7	8	1

*/
public class pattern56
{
	public static void main(String x [])
	{
		int count=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
					System.out.printf("%d\t",  (count%8)+1);
					count++;
					
			}
			System.out.printf("\n");
		}
	}
}