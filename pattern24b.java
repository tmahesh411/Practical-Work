/*
Q24. Write a java program to print this pattern.

				*
			*	*	*
		*		*		*
	*			*			*
*	*	*	*	*	*	*	*	*
	*			*			*
		*		*		*
			*	*	*
				*

*/
import java.util.*;
public class pattern24b{
	public static void main(String x[]){
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter num for Matrix");
	
	int n=xyz.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==5||i==5||j==6-i||j==4+i||j==i-4||j==14-i)
				{
					System.out.printf("*  ");
					}
					else{
					System.out.printf("   ");
				}
			}
			
			System.out.println();
		}
	}
}