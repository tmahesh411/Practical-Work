/*Q83. Write a java program to print this pattern.

A   B   C   D   E
  A   B   C   D
    A   B   C
      A   B
        A
*/

public class pattern83
{
    public static void main(String x[])
    {
        for(int i=1; i<=5; i++)
        {   char ch='A';
            for(int j=1; j<=9; j++)
			{
				if(j>=i&&j<=10-i&&(i+j)%2==0)
			
            { System.out.printf("%c ",ch++);
               
            }else{System.out.printf("  ");
			}
			}
            System.out.printf("\n");
        }
    }
}