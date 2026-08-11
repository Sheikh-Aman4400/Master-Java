package patterns.half01;

/*

10.      *
        * *
       * * *
      * * * *
     * * * * *

 */

public class Pattern10 {

    static void main(String[] args) {

        p10(5);
    }

    static void p10(int num){

        for (int row = 0; row <= num; row++) {

            for (int i = 0; i < num - row; i++) {
                System.out.print(" ");
            }

            for (int col = 0; col < row; col++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
}
