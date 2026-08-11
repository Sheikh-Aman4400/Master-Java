package patterns.half01;

/*


15.      *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *

 */

public class Pattern15 {

    static void main(String[] args) {

        p15(5);
    }

    static void p15(int num) {

        for (int row = 1; row <= 2 * num - 1; row++) {

            // Print leading spaces
            int space = row < num ? num - row : row - num;
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }


            // First row
            if (row == 1 || row == 2 * num - 1) {
                System.out.print("*");
            }
            // Middle rows
            else {
                System.out.print("*");

                // Print inside spaces
                int inside = row <= num
                        ? 2 * row - 3
                        : 2 * (2 * num - row) - 3;

                for (int i = 1; i <= inside; i++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            System.out.println();
        }
    }
}
