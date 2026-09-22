/*
Q100. Write a java program to print this pattern.
    D
	D	C
	D	C	B
	D	C	B	A
	D	C	B
	D	C
	D

*/
public class pattern100
{
    public static void main(String x[])
    {
        for(int i=1; i<=7; i++)
        {   char ch='D';
            for(int j=1; j<=4; j++)
			{
				if(j<=i&&j<=8-i)
			
            { System.out.printf("%c ",ch--);
               
            }else{System.out.printf("  ");
			}
			}
            System.out.printf("\n");
        }
    }
}