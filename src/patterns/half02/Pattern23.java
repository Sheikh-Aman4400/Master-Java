package patterns.half02;

/*

// Maybe this question is wrong cause I am unable to find the solution.

23.        *      *
         *   *  *   *
       *      *      *

*/


public class Pattern23 {

    public static void main(String[] args) {
        p23(9);
    }

    static void p23(int n) {

        for (int row = 0; row < 3; row++) {

            for (int col = 0; col < n; col++) {

                if ((row + col) % 4 == 0 ||
                        (row == 1 && col % 4 == 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            System.out.println();
        }
    }
}