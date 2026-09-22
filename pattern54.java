/*
Q54. Write a java program to print this pattern.
    1
   212
  32123
 4321234
543212345
*/ 
public class pattern54{
	public static void main(String x []){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.printf(" ");
			}
			//first part
           for(int j=i; j>=1; j--) {
               System.out.print(j);
           }


           //second part
           for(int j=2; j<=i; j++) {
               System.out.print(j);
           }
           System.out.println();

		}
	}
}
