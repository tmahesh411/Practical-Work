/*

Q52. Write a java program to print this pattern.

	1	*	*	*	*
	2	2	*	*	*
	3	3	3	*	*
	4	4	4	4	*
	5	5	5	5	5

*/
public class pattern52{
	public static void main(String x []){
		for(int i=1;i<=5;i++){
			int k=1;
			for(int j=1;j<=5;j++){
				if(j<=i){
					System.out.printf("%d",i);
					
				}else{
					System.out.printf("*");
					
				}
			}
			System.out.printf("\n");
		}
	}
}