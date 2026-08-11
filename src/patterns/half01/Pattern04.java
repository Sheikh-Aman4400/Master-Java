package patterns.half01;

/*

4.  1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

 */

public class Pattern04 {
    static void main(String[] args) {

        p4(5);
    }

    static void p4(int num){

        for (int row = 0; row <= num; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}
