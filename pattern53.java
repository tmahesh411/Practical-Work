/*
Q53. Write a java program to print this pattern.

	5	*	5	*	5
	4	*	4	*
	3	*	3
	2	*
	1

*/


public class pattern53{
	public static void main(String x []){
		for(int i=1;i<=5;i++){
			
			for(int j=1;j<=5;j++){
				if(j<=6-i){
					if(j%2==0){ 
						System.out.printf("*");
					}else{
					System.out.printf("%d",6-i);
				}	
				}else{
					System.out.printf(" ");
					
				}
			}
			System.out.printf("\n");
		}
	}
}