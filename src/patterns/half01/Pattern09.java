package patterns.half01;

/*

9.  *********
     *******
      *****
       ***
        *

 */

public class Pattern09 {

    static void main(String[] args) {

        p9(5);
    }

    static void p9(int num){

        for (int row = 0; row <= num; row++) {

            for (int i = 0; i < row; i++) {
                System.out.print("  ");
            }

            for (int col = (2 * num) - (2 * row) - 1; col > 0; col--) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
}
