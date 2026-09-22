/*`
		 *
       * *
     * * *
   * * * *


	
*/
public class Pattern5{
	public static void main(String x []){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i>=5-j){
					System.out.printf("*");
				}else{
					System.out.printf(" ");
				}
			}System.out.printf("\n");
		}
	}
} 