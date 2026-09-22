/*
A B C D E D C B A
A               A
A               A
A               A
A               A

*/

public class pattern97
{
    public static void main(String x[])
    {
        for(int i=1; i<=5; i++)
        {   char ch='A';
			char c='D';
            for(int j=1; j<=9; j++)
            { if(j==1||(i==1&&j<=5)){
				System.out.printf("%c",ch++);
			}else if((i==1&&j>=5)){
				System.out.printf("%c",c--);
			}else if(j==9){
				System.out.printf("%c",'A');
			}else{
				System.out.printf(" ");
			}
            }
            System.out.printf("\n");
        }
    }
}
