/*
Que 93 WAP for following pattern
A B C D
A     D
A     D
A B C D

*/
public class pattern93

 {
    public static void main(String[] args) {
       

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                
                if (i==0||j==0||i==3||j==3) {
                    System.out.print((char) ('A' +j)+ " ");

                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}