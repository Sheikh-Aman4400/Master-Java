package patterns.half01;

/*

8.      *
       ***
      *****
     *******
    *********

 */

public class Pattern08 {
    static void main(String[] args) {

        p8(5);
    }

    static void p8(int num){

        for (int row = 0; row <= num; row++) {

            for (int i = 0; i < num - row; i++) {
                System.out.print("  ");
            }

            for (int col = 0; col < 2 * row - 1 ; col++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
}
