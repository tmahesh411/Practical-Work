/*
Q84. Write a java program to print this pattern.
A 1 2 3 4
A B 1 2 3
A B C 1 2
A B C D 1
A B C D E
*/

public class pattern84
{
    public static void main(String x[])
    {
        for(int i=1; i<=5; i++)
        {   char ch='A';
			int k=1;
            for(int j=1; j<=5; j++)
			{
				if(j<=i)
			
            { System.out.printf("%c ",ch++);
               
            }else{System.out.printf("%d ",k++);
			}
			}
            System.out.printf("\n");
        }
    }
}