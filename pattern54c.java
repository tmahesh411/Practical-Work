/*
Q54. Write a java program to print this pattern.

					1	
				2	3	2
			3	4	5	4	3
        4	5	6	7	6	5	4
	5	6	7	8	9	8	7	6	5

*/
public class pattern54c
{
    public static void main(String x[])
    {
		int n=5;
        for(int i=1; i<=n; i++)
        {   int k=i;
            for(int j=1; j<=(n+i-1); j++)
            { 
                if(j<=n-i){
					System.out.printf("\t");
				}else{
					System.out.printf(k+"\t");
					if(j<n)
					{
						k++;
					}
					else{
						k--;
					}			
                }
            }
            System.out.printf("\n");
        }
    }
}
