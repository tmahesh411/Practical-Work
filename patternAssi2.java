/*

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

*/

public class patternAssi2{
	public static void main(String x []){
	
		for(int i=1;i<=9;i++){
			for(int j=1;j<=10;j++){
			
				String str = (i>=j && i<=5) || (j<=10-i && i>5) || (j>=11-i && i<=5) || (j>=(i+1) && i>5) ? "*" : " ";
					System.out.printf(str);
				
			}
			System.out.println();
		}
	}
}