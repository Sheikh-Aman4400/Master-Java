package patterns.half01;

/*

3.  *****
    ****
    ***
    **
    *

 */

public class Pattern03 {
    static void main(String[] args) {

        p3(5);
    }

    static void p3(int num){

        for (int row = 0; row < num; row++) {

            for (int col = num - row; col > 0; col--) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
}
