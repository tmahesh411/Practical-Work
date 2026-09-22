/*
Q91. Write a java program to print this pattern.

								A
						1	2	1
				A	B	C	B	A
		1	2	3	4	3	2	1
A	B	C	D	E	D	C	B	A


*/
public class pattern91
{
    public static void main(String x[])
    {
        for(int i=1; i<=5; i++)
        {   char ch='A';
            for(int j=1; j<=(2*i-1); j++)
            { System.out.printf("%c ",ch);
                if(j<i&&i%2!=0)
                {
                    ch++;
                }
                else{
                    ch--;
                }
            }
			
            System.out.printf("\n");
        }
    }
}
