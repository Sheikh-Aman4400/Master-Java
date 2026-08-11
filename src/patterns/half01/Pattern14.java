package patterns.half01;

/*

14.  *********
      *     *
       *   *
        * *
         *

 */

public class Pattern14 {

    static void main(String[] args) {

        p14(5);
    }

    static void p14(int num) {

        for (int row = 1; row <= num; row++) {

            // Print leading spaces
            for (int i = 1; i <= row; i++) {
                System.out.print(" ");
            }

            // Last row
            if (row == 1) {
                for (int i = 1; i <= 2 * num - 1; i++) {
                    System.out.print("*");
                }
            }
            // First row
            else if (row == num) {
                System.out.print("*");
            }
            // Middle rows
            else {
                System.out.print("*");

                // Print inside spaces
                for (int i = 1; i <= 2 * (num - row) - 1; i++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            System.out.println();
        }
    }
}
