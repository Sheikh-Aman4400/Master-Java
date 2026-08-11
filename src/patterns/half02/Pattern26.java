package patterns.half02;

/*


26.   1 1 1 1 1 1
      2 2 2 2 2
      3 3 3 3
      4 4 4
      5 5
      6

*/

public class Pattern26 {

    public static void main(String[] args) {
        p26(5);
    }

    static void p26(int n) {

        int value = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(value + " ");
            }
            System.out.println();
            value++;
        }
    }
}