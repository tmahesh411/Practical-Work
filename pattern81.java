/*
        A
      B A
    C B A
  D C B A
E D C B A

*/

public class pattern81{
	public static void main(String x[]){
		for(int i=1;i<=5;i++){
			//char ch='A';
			for(int j=1;j<=5;j++){
				if(j>=6-i){
					char ch=(char)('F'-j);
				System.out.printf("%c ",ch);
			
			}else{
				System.out.printf("  ");
			}
			}
			System.out.println();
		}
	}
}