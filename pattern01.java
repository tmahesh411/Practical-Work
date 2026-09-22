public class pattern01
{
	public static void main(String x [])
	{
		int count=1;
		for(int i=1;i<=4;i++)
		{	boolean flag=true;
			for(int j=1;j<=7;j++)
			{
				if(j>=5-i&&j<=3+i&&flag)
				{
					System.out.printf("%d",count);
					
					flag=false;
					++count;
				}else{
					System.out.printf(" ");
					flag=true;
				}
			}
			System.out.printf("\n");
		}
	}
}