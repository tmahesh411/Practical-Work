/* Q35. Write a java program to print this pattern.
1	2	3	4	5	6	7	8	9
		     	*					1 j>=6-i  j<=4+i
    		*	*	*				2 
   		*	*	*	*	*			3 
  	*	*	*	*	*	*	*		4 
 *	*	*	*	*	*	*	*	*	5 	
			*	*	*				6 j>=4&&j<=6     
			*	*	*				7 j>=4&&j<=6
			*	*	*				8 
			*	*	*				9 
			*	*	*				10 
			*	*	*				11 

*/
public class pattern35
{
	public static void main(String x [])
	{
		for(int i=1;i<=11;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j>=6-i&&j<=4+i&&i<=5||((j==4||j==5||j==6) &&i>5))
				{	
					System.out.printf("* ");
				}else{
					System.out.printf("  ");
				}
			}
			System.out.printf("\n");
		}
	}
}