package patterns.half02;

/*

19.    *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *

*/

public class Pattern29 {

    public static void main(String[] args) {
        p29(5);
    }

    static void p29(int n) {

        for (int row = 0; row < 2 * n - 1; row++) {

            int stars;

            if (row < n) {
                stars = row + 1;
            } else {
                stars = 2 * n - row - 1;
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