/*
Q61. Write a java program to print this pattern.

					1
				1		2
			1		2		3
		1		2		3		4
	1		2		3		4		5
		1		2		3		4
			1		2		3
				1		2
					1

*/
public class pattern61{
	public static void main(String x []){
		
		for(int i=1;i<=9;i++){
			int k=1;
			for(int j=1;j<=9;j++){
				if(j>=6-i&&j<=4+i&&j>=i-4&&j<=14-i&&(i+j)%2==0){
					System.out.printf("%d",k++);
				
				}else{
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}
	}
}