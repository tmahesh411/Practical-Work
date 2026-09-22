

/*
*****
 ****
  ***
   **
    *
*/

public class PatternHalf{
	public static void main(String x []){
		for(int row=1;row<=5;row++){
			for(int col=1;col<=5;col++){
				if(row<=col){
					System.out.printf("*");
				}else{
					System.out.printf(" ");
				}
			}System.out.printf("\n");
		}
	}
}


