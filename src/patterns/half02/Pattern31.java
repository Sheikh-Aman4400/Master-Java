package patterns.half02;

/*

31.      4 4 4 4 4 4 4
         4 3 3 3 3 3 4
         4 3 2 2 2 3 4
         4 3 2 1 2 3 4
         4 3 2 2 2 3 4
         4 3 3 3 3 3 4
         4 4 4 4 4 4 4

*/

public class Pattern31 {

    public static void main(String[] args) {
        p31(4);
    }

    static void p31(int n) {

        int size = 2 * n - 1;

        for (int row = 0; row < size; row++) {

            for (int col = 0; col < size; col++) {

                int top = row;
                int left = col;
                int bottom = size - 1 - row;
                int right = size - 1 - col;

                int min = Math.min(Math.min(top, bottom),
                        Math.min(left, right));

                System.out.print((n - min) + " ");
            }

            System.out.println();
        }
    }
}