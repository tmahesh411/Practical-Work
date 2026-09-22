/*
Q73. Write a java program to print this pattern.

1        							1
1	2							2	1
1	2	3					3	2	1
1	2	3	4			4	3	2	1
1	2	3	4	5	5	4	3	2	1



*/

public class pattern69b {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
			for(int j=1;j<=10;j++){
				if(j<=i){
					
					System.out.printf("%d",j);
				}else if(j>=11-i){
					System.out.printf("%d",11-j);
				}else{
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}
    }
}
