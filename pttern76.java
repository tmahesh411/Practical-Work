/*
Que 76
A  A  A  A  A
B  B  B  B  B
C  C  C  C  C
D  D  D  D  D
E  E  E  E  E
*/


public class pttern76{
	public static void main(String x[]){
		for(int i=0;i<=4;i++){
			
			for(int j=0;j<=4;j++){
				char ch=(char)('A'+i);
				System.out.printf("%c  ",ch);
				
			}
			System.out.println();
		}
	}
}