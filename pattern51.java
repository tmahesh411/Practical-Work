/*
Q51. Write a java program to print this pattern.

	1	2	3	4	5	6	7	8	9
		1	2	3	4	5	6	7
			1	2	3	4	5	
				1	2	3
					1

*/

public class pattern51{
	public static void main(String x []){
		for(int i=1;i<=5;i++){
			int k=1;
			for(int j=1;j<=9;j++){
				if(j>=i&&j<=10-i){
					System.out.printf("%d",k++);
					
				}else{
					System.out.printf(" ");
					
				}
			}
			System.out.printf("\n");
		}
	}
}