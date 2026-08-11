package patterns.half02;

/*

18.   **********
      ****  ****
      ***    ***
      **      **
      *        *
      *        *
      **      **
      ***    ***
      ****  ****
      **********

 */

public class Pattern18 {

    public static void main(String[] args) {
        p18(5);
    }

    static void p18(int n) {

        for (int row = 0; row < 2 * n; row++) {

            int stars;
            if (row < n) {
                stars = n - row;
            } else {
                stars = row - n + 1;
            }

            // Left stars
            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }

            // Middle spaces
            int spaces = 2 * (n - stars);
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }

            // Right stars
            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}