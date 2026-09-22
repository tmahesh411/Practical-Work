
/*
    *	*	*	*	*
	*				*
	*				*
	*				*
	*	*	*	*	*

*/


public class DemoPattern
{
	public static void main(String x[])
	{
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
				if(row==1 || row==5||col==1||col==5)
				{
					System.out.printf("* ");
				}else
				{
				System.out.printf("  ");
				}
			}System.out.printf("\n");
		}
	}
}



