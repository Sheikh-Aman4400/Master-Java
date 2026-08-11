package patterns.half02;

/*

35.    1      1
       12    21
       123  321
       12344321

*/

public class Pattern35 {

    public static void main(String[] args) {
        p35(4);
    }

    static void p35(int n) {

        for (int row = 1; row <= n; row++) {

            // Left part
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            // Middle spaces
            for (int space = 1; space <= 2 * (n - row); space++) {
                System.out.print("  ");
            }

            // Right part
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}