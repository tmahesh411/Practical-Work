/*
Q63. Write a java program to print this pattern.

	1	1	1	1	1	1	1
		2	2	2	2	2	
			3	3	3	
				4
			5	5	5
		6	6	6	6	6
	7	7	7	7	7	7	7

*/
public class pattern63{
	public static void main(String x []){
		
		for(int i=1;i<=7;i++){
			for(int j=1;j<=7;j++){
				if(j>=i&&j<=8-i||j>=8-i&&j<=i){
					System.out.printf("%d",i);
				
				}else{
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}
	}
}