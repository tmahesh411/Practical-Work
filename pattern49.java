/*
Q49. Write a java program to print this pattern.

	5	4	3	2	1
		4	3	2	1
			3	2	1	
				2	1	
					1
*/



public class pattern49{
	public static void main(String x []){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i<=  j){
					System.out.printf("%d",(6-j));
				}else{
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}
	}
}