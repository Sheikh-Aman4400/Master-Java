package patterns.half01;

/*

6.       *
        **
       ***
      ****
     *****

 */

public class Pattern06 {
    static void main(String[] args) {

        p6(5);
    }

    static void p6(int num){

        for (int row = 0; row <= num; row++) {

            for (int i = 0; i < num - row; i++) {
                System.out.print("  ");
            }

            for (int col = 0; col < row; col++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
}
