/*
Q82. Write a java program to print this pattern.

			A
		  A   B
		A	B	C
	  A	  B	  C	  D
	A	B	C	D	E

*/
public class pattern82
{
    public static void main(String x[])
    {
        for(int i=1; i<=5; i++)
        {   char ch='A';
            for(int j=1; j<=9; j++)
			{
				if(j>=6-i&&j<=4+i&&(i+j)%2==0)
			
            { System.out.printf("%c ",ch++);
               
            }else{System.out.printf("  ");
			}
			}
            System.out.printf("\n");
        }
    }
}