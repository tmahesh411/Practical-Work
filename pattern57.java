/*
1  2  3  4  5
2  2  3  4  5
3  3  3  4  5
4  4  4  4  5
5  5  5  5  5
*/


public class pattern57
{
	public static void main(String x [])
	{
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=i){
					System.out.printf("%d  ",i);
					
				}else{
				System.out.printf("%d  ",j);	
				}				
			}
			System.out.printf("\n");
		}
	}
}