package patterns.half02;

/*


27.   1 2 3 4  17 18 19 20
        5 6 7  14 15 16
          8 9  12 13
            10 11

*/

public class Pattern27 {

    public static void main(String[] args) {
        p27(5);
    }

    static void p27(int n) {

        int start = 1;
        int end = n * (n - 1);

        for (int row = 0; row < n; row++) {

            // Leading spaces
            for (int s = 0; s < row; s++) {
                System.out.print("  ");
            }

            int count = n - row - 1;

            // Left numbers
            for (int j = 0; j < count; j++) {
                System.out.print(start + " ");
                start++;
            }

            System.out.print(" ");

            // Right numbers
            for (int j = 0; j < count; j++) {
                System.out.print(end + " ");
                end++;
            }

            // Prepare end for next row
            end -= 2 * count;

            System.out.println();
        }
    }
}