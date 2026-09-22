/*
Q88. Write a java program to print this pattern.

A       I
 B     H
  C   G
   D F
    E
	
*/

public class pattern88

 {
    public static void main(String[] args) {
       

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                // If it's the left slope or the right slope position
                if (j == i || j == (9 - 1) - i) {
                    System.out.print((char) ('A' + j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
