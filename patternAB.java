/*
A
AB
ABC
ABCD
ABCDE
*/

public class patternAB{
	public static void main(String x[]){
		for(int i=1;i<=5;i++){
		char ch='A';
		for(int j=1;j<=5;j++){
			if(j<=i){
				System.out.printf("%c",ch);
				ch++;
			}else{
				System.out.printf(" ");
			}
		}
		System.out.println();
		}
	}
}