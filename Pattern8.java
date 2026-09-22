/*
#
#	*
#	*	#
#	*	#	*
#	*	#	*	#
*/
public class Pattern8
{
	public static void main(String x [])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
			
			if (j <= i) {

                    if (j % 2 != 0) {
                        System.out.printf("#");
                    } else {
                        System.out.printf("*");
                    }

                } else {
                    System.out.printf(" ");
                }
            }

            System.out.printf("\n");
		}
	}
}

				