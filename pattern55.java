/*
Q55. Write a java program to print this pattern.

	1
	3	3	3
	5	5	5	5	5	
	3	3	3
	1

*/
public class pattern55{
	public static void main(String x []){
		int k=1;
		for(int i=1;i<=5;i++){
			
			for(int j=1;j<=k;j++){
				
					System.out.printf("%d  ",k);
				
			}
			System.out.printf("\n");
			if (i < 3) {
                k += 2;
            } else {
                k -= 2;
            }
		}
	}
}