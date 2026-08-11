package patterns.half02;

/*


28.      *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *

*/

public class Pattern28 {

    public static void main(String[] args) {
        p28(5);
    }

    static void p28(int n) {

        for (int i = 0; i < 2 * n - 1; i++) {

            int stars = (i < n) ? i + 1 : 2 * n - i - 1;
            int spaces = n - stars;

            // Leading spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}