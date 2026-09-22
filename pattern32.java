/*

Q32. Write a java program to print this pattern.

*
# #
* * *
# # # #
* * * * *
# # # # # #


*/

public class pattern32{
	public static void main(String x[]){
		for(int i=1;i<=6;i++){
			for(int j=1;j<=6;j++){
				if(j<=i)
				{
					if(i%2==0){
						System.out.printf("# ");
					}else{
						System.out.printf("* ");
					}
				}else{
					System.out.printf("  ");
				}
			}
			System.out.println();
		}
	}
}