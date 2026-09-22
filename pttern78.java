/*   78
A  B  C  D  E
B  C  D  E  F
C  D  E  F  G
D  E  F  G  H
E  F  G  H  I
*/

public class pttern78{
	public static void main(String x[]){
		for(int i=0;i<=4;i++){
			
			for(int j=0;j<=4;j++){
				char ch = (char) ('A' + i + j);
				System.out.printf("%c  ",ch);
			}
			System.out.println();
		}
	}
}

