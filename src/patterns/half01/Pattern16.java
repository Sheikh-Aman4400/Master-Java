package patterns.half01;

/*

16.           1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1

 */

public class Pattern16 {

    static void main(String[] args) {

        p16(5);
    }

    static void p16(int num) {

        for (int row = 0; row < num; row++) {

            // Print leading spaces
            for (int i = 0; i < num - row - 1; i++) {
                System.out.print("  ");
            }

            int value = 1;

            // Print Pascal's Triangle values
            for (int col = 0; col <= row; col++) {
                System.out.print(value + "   ");

                value = value * (row - col) / (col + 1);
            }

            System.out.println();
        }
    }
}
