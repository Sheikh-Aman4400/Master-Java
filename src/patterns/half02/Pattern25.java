package patterns.half02;

/*

25.    *****
        *   *
         *   *
          *   *
           *****

*/

public class Pattern25 {

    public static void main(String[] args) {
        p25(5);
    }

    static void p25(int n) {

        for (int row = 0; row < n; row++) {

            // Leading spaces
            for (int s = 0; s < row; s++) {
                System.out.print(" ");
            }

            // Stars and inner spaces
            if (row == 0 || row == n - 1) {

                for (int col = 0; col < n; col++) {
                    System.out.print("*");
                }

            } else {

                System.out.print("*");

                for (int col = 0; col < n - 2; col++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            System.out.println();
        }
    }
}