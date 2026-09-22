/*

Q41. Write a java program to print this pattern.

        *					*
	  *	  *               *   *
	*	*	*			*	*	*
  *	  *   *   *       *   *   *   *
*	*	*	*	*	*	*	*	*	*	

5 by 19
*/
public class pattern41
{
	public static void main(String x [])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=19;j++)
			{
				if(((j>=6-i&&j<=4+i)||(j>=16-i&&j<=14+i))&&(i+j)%2==0)
				{	
					System.out.printf("*");
				}else{
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}
	}
}