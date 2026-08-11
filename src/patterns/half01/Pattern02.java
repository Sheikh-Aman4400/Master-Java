package patterns.half01;

/*

2.  *
    **
    ***
    ****
    *****

 */

public class Pattern02 {
    static void main(String[] args) {

        p2(5);
    }

    static void p2(int num){

        for (int row = 0; row < num; row++) {

            for (int col = 0; col <= row; col++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
}
