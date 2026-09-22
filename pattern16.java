/*
Q15. Write a java program to print this pattern.

		#	#	#	#	#
		#	#
		#		#
		#			#
		#				#

*/

public class pattern16{
	public static void main (String x []){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==1||j==1||i==j){
				
					System.out.printf("# ");
				}else{
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}
}