/*

*   *   *   *   *   *
  *   *   *   *   *
    *   *   *   *
      *   *   *
        *   *
          *
		  
*/


public class pattern18 {
    public static void main(String[] args) {
        

        for (int i = 1; i <= 6; i++) {

            for (int j = 1; j <= 11;j++) {

                if (j >= i &&j<=12-i && (i + j) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}