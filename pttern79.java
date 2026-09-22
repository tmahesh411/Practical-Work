/*
A
B  B
C  C  C
D  D  D  D
E  E  E  E  E
*/


public class pttern79{
	public static void main(String x[]){
		for(int i=0;i<=4;i++){
			//char ch='A';
			for(int j=0;j<=4;j++){
				if(j<=i){
					char ch=(char)('A'+i);
				System.out.printf("%c  ",ch);
			}else{
				System.out.printf(" ");
			}
			}
			System.out.println();
		}
	}
}