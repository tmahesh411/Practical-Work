/*
Q50. Write a java program to print this pattern.
				
			1
		  1   2
	 	1	2	3
      1   2	  3   4
	1	2	3	4	5


*/
public class pattern50{
	public static void main(String x []){
		boolean flag=true;
		for(int i=1;i<=5;i++){
			int k=1;
			for(int j=1;j<=9;j++){
				if(j>=6-i&&j<=4+i&&flag){
					System.out.printf("%d",k++);
					flag=false;
				}else{
					System.out.printf(" ");
					flag=true;
				}
			}
			System.out.printf("\n");
		}
	}
}