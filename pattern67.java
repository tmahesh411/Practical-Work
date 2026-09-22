/*
Q67.  Write a java program to print this pattern.

	1	2	3	4	5
	6			7
	8		9
	10	11
	12
*/
public class pattern67{
	public static void main (String x []){
		int k=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==1||j==1||j==6-i){
					System.out.printf("%d\t",k++);
				}else{
					System.out.printf(" \t");
				}
			}
			System.out.println();
		}
	}
}