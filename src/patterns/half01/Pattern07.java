package patterns.half01;

/*

7.   *****
      ****
       ***
        **
         *

 */

public class Pattern07 {
    static void main(String[] args) {

        p7(5);
    }

    static void p7(int num){

        for (int row = 0; row <= num; row++) {

            for (int i = 0; i < row; i++) {
                System.out.print("  ");
            }

            for (int col = 0; col < num - row; col++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
}
