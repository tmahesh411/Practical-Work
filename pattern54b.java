/*
	1	
	2	3	2
	3	4	5	4	3
	4	5	6	7	6	5	4
	5	6	7	8	9	8	7	6	5

*/ 
public class pattern54b
{
    public static void main(String x[])
    {
        for(int i=1; i<=5; i++)
        {   int k=i;
            for(int j=1; j<=(2*i-1); j++)
            { System.out.printf("%d",k);
                if(j<i)
                {
                    ++k;
                }
                else{
                    --k;
                }
            }
            System.out.printf("\n");
        }
    }
}
