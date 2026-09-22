/*
Q87. Write a java program to print this pattern.

				1
			A	B	C
		2	3	4	5	6
	D	E	F	G	H	I	J
7	8	9	10	11	12	13	14	15

*/

public class pattern87
{
    public static void main(String x[])
    {		
		char ch='A';
		int k=1;
        for(int i=1; i<=5; i++)
        {   
            for(int j=1;j<=9; j++)
			{
				if(j>=6-i&&j<=4+i&&i%2!=0){
					System.out.printf("%d\t",k++);
				}else if(j>=6-i&&j<=4+i&&i%2==0){
					System.out.printf("%c\t",ch++);
				}else{
					System.out.printf(" \t");
				}
			}
            System.out.printf("\n");
        }
    }
}