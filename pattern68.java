/*
Q68. Write a java program to print this pattern.
        1
      2   2
    3       3
  4           4
5   5   5   5   5

*/
public class pattern68{
	public static void main (String x []){
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if(j==6-i||j==4+i||i==5&&(i+j)%2==0){
					System.out.printf("%d ",i);
				}else{
					System.out.printf("  ");
				}
			}
			System.out.println();
		}
	}
}