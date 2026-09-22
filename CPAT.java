/*
ABCDEABCD
ABCD ABCD
ABC   BCD
AB     CD
A       D

*/ 


public class CPAT
{
    public static void main(String x[])
    {
        for(int i=1; i<=5; i++)
        {
            char ch='A';
            for(int j=1; j<=9; j++)
            {
                if(j<=6-i)
                { System.out.printf("%c",(char)j+64);
                }
                else if(j>=4+i)
                { System.out.printf( "%c",(char)j+59);
                }
                else{
                    System.out.printf(" ");
                }

            }
            System.out.printf("\n");
        }
    }
}
