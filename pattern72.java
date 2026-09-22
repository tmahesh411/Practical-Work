/*
Q72. Write a java program to print this pattern.
1                                                               9
        2                                               8
                3                               7
                        4               6
                                5
                        4               6
                3                               7
        2                                               8
1                                                               9
*/

public class pattern72{
	public static void main (String x []){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if(i==j||j==10-i){
					System.out.printf("%d\t",j);
				}else{
					System.out.printf(" \t");
				}
			}
			System.out.printf("\n");
		}
	}
}