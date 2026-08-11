package patterns.half02;

/*

24.    *        *
       **      **
       * *    * *
       *  *  *  *
       *   **   *
       *   **   *
       *  *  *  *
       * *    * *
       **      **
       *        *

*/

public class Pattern24 {

    public static void main(String[] args) {
        p24(5);
    }

    static void p24(int n) {

        for (int row = 1; row <= 2 * n; row++) {

            int totalCols;

            if (row <= n) {
                totalCols = row;
            } else {
                totalCols = 2 * n - row + 1;
            }

            // Left Part
            for (int col = 1; col <= totalCols; col++) {
                if (col == 1 || col == totalCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Middle Spaces
            int spaces = 2 * (n - totalCols);
            for (int i = 1; i <= spaces; i++) {
                System.out.print(" ");
            }

            // Right Part
            for (int col = 1; col <= totalCols; col++) {
                if (col == 1 || col == totalCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}