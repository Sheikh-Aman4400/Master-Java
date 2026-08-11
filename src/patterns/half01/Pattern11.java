package patterns.half01;

/*

11.  * * * * *
      * * * *
       * * *
        * *
         *
 */

public class Pattern11 {

    static void main(String[] args) {

        p11(5);
    }

    static void p11(int num){

        for (int row = 0; row <= num; row++) {

            for (int i = 0; i < row; i++) {
                System.out.print(" ");
            }

            for (int col = 0; col < num - row; col++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
}
