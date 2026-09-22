/*Q37. Write a java program to print this pattern.
1	2	3	4	5
*	*	*	*	*	1
          		*	2	
*	*	*   	*	3	
*   	*    	*	4
* 	*	*   * 	*	5

*/

public class pattern37
{
	public static void main(String x [])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||i==5||j==5||(i>=3&&j<=3))
				{	
					if(i==4&&j==2){
						System.out.printf("  ");
					}else{
					System.out.printf("* ");
					}
				}else{
					System.out.printf("  ");
				}
			}
			System.out.printf("\n");
		}
	}
}