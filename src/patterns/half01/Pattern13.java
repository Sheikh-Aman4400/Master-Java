package patterns.half01;

/*

13.      *
        * *
       *   *
      *     *
     *********

 */

public class Pattern13 {

    static void main(String[] args) {

        p13(5);
    }

    static void p13(int num) {

        for (int row = 1; row <= num; row++) {

            // Print leading spaces
            for (int i = 1; i <= num - row; i++) {
                System.out.print(" ");
            }

            // Last row
            if (row == num) {
                for (int i = 1; i <= 2 * num - 1; i++) {
                    System.out.print("*");
                }
            }
            // First row
            else if (row == 1) {
                System.out.print("*");
            }
            // Middle rows
            else {
                System.out.print("*");

                // Print inside spaces
                for (int i = 1; i <= 2 * row - 3; i++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            System.out.println();
        }
    }
}
