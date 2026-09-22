/*

Q27. Write a java program to print this pattern.

	*
	*	*
	*	*	*
	*
	*	*
	*	*	*

*/
public class pattern27{
	public static void main(String x []){
		
		for(int i=1;i<=6;i++){
			for(int j=1;j<=3;j++){
			
			if(j <= i % 3 || i % 3 == 0)
			if()
			{
				System.out.printf("*");
				}else{
				System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}
}