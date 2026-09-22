/*
Que 80

E E E E E
D D D D
C C C
B B
A

*/

public class pttern80{
	public static void main(String x[]){
		for(int i=1;i<=5;i++){
			//char ch='A';
			for(int j=1;j<=5;j++){
				if(j<=6-i){
					char ch=(char)('F'-i);
				System.out.printf("%c ",ch);
			
			}else{
				System.out.printf(" ");
			}
			}
			System.out.println();
		}
	}
}