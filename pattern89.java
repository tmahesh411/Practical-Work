/*
Q89. Write a java program to print this pattern.
A       B       C       D       E
        1       2       3       4
                A       B       C
                        1       2
                                A
*/
public class pattern89{
	
    public static void main(String x[])
    {		
		
        for(int i=1; i<=5; i++)
        {  
		char ch='A';
		int k=1;
	
            for(int j=1;j<=5; j++)
			{
				if(j>=i&&i%2!=0){
					System.out.printf("%c\t",ch++);
				}else if(j>=i&&i%2==0){
					System.out.printf("%d\t",k++);
				}else{
					System.out.printf(" \t");
				}
			}
            System.out.printf("\n");
        }
    }
}