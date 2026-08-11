package patterns.half02;

/*

34.    E D C B A
       D C B A
       C B A
       B A
       A

*/

public class Pattern34 {

    public static void main(String[] args) {
        p34(5);
    }

    static void p34(int n) {

        for (int row = 0; row < n; row++) {

            char ch = (char) ('A' + n - row - 1);

            while (ch >= 'A') {
                System.out.print(ch + " ");
                ch--;
            }

            System.out.println();
        }
    }
}