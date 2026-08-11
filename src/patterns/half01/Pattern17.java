package patterns.half01;

/*

17.      1
        212
       32123
      4321234
       32123
        212
         1

 */

public class Pattern17 {

    static void main(String[] args) {

        p17(5);
    }

    static void p17(int num) {

        for (int row = 1; row <= 2 * num - 1; row++) {

            int totalCols = row <= num
                    ? row
                    : 2 * num - row;

            // Print spaces
            for (int i = 0; i < num - totalCols; i++) {
                System.out.print(" ");
            }

            // Print decreasing numbers
            for (int i = totalCols; i >= 1; i--) {
                System.out.print(i);
            }

            // Print increasing numbers
            for (int i = 2; i <= totalCols; i++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
