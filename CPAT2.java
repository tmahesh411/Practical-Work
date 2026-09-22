/*
A
ABA
ABCBA
ABCDCBA
ABCDEDCBA

*/


public class CPAT2
{
    public static void main(String x[])
    {
        for(int i=1; i<=5; i++)
        {   char ch='A';
            for(int j=1; j<=(2*i-1); j++)
            { System.out.printf("%c",ch);
                if(j<i)
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
