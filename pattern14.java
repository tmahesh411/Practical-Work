/*
Q14. Write a java program to print this pattern.

	 *******
	 ******
	 *****
	 ****
	 ***
	 **
	 *
	 **
	 ***
	 ****
	 *****
	 ******
	 *******
*/
import java.util.*;
 public class pattern14{
	public static void main(String x []){
		for(int i=1;i<=13;i++){
			for(int j=1;j<=7;j++){
			
			if(i<=8-j&&j <= 8 - i||i >= 8 && j <= i - 6){
			
				System.out.printf("*");
			}else{
				System.out.printf(" ");
			}
			}
			System.out.printf("\n");
		}
	}
 }