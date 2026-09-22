/*	*	#	*	#	*
	*	#	*	#	*
	*	#	*	#	*
	*	#	*	#	*
	*	#	*	#	*
*/

public class Hash2Pattern{
	public static void main(String x[])throws Exception{
		
		for(int row=1;row<=5;row++){
			for(int col =1;col<=5;col++){
				
				if(col%2!=0){
					
					System.out.printf("* ");
					Thread.sleep(200);
					
				}else{
					System.out.printf("# ");
				}
			}System.out.printf("\n");
		}
	}
	
}
