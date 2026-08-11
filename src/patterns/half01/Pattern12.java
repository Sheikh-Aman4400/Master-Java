package patterns.half01;

/*

12.  * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *

 */

public class Pattern12 {

    static void main(String[] args) {

        p11(5);
    }

    static void p11(int num){

        for (int row = 0; row < 2 * num; row++) {

            int spaces = row < num ? row : 2 * num - row - 1;
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }

            int column = row < num ? num - row : row - num + 1;
            for (int col = 0; col < column; col++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
}
