/*
Q85. Write a java program to print this pattern.

	1
	A	B
	1	2	3
	A	B	C	D
	1	2	3	4	5
*/

public class pattern85
{
    public static void main(String x[])
    {
        for(int i=1; i<=5; i++)
        {   char ch='A';
			int k=1;
            for(int j=1; j<=i; j++)
			{
				if(i%2==0)
			
            { System.out.printf("%c ",ch++);
               
            }else{System.out.printf("%d ",k++);
			}
			}
            System.out.printf("\n");
        }
    }
}