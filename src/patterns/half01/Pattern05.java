package patterns.half01;

/*

5.  *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *

 */

public class Pattern05 {
    static void main(String[] args) {

        p5(5);
    }

    static void p5(int num){
        int lenCol = 2 * num;

        for (int row = 0; row < lenCol; row++) {
            int currentCol = row > num ? lenCol - row : row;

            for (int col = 0; col < currentCol; col++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
}
