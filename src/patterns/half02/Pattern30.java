package patterns.half02;

/*

30.         1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5

*/

public class Pattern30 {

    public static void main(String[] args) {
        p30(5);
    }

    static void p30(int n) {

        for (int row = 1; row <= n; row++) {

            // Leading spaces
            for (int s = 0; s < n - row; s++) {
                System.out.print("  ");
            }

            // Descending numbers
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            // Ascending numbers
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}