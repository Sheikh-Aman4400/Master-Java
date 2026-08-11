package patterns.half02;

/*

32.    E
       D E
       C D E
       B C D E
       A B C D E

*/

public class Pattern32 {

    public static void main(String[] args) {
        p32(5);
    }

    static void p32(int n) {

        for (int row = 1; row <= n; row++) {

            char ch = (char) ('A' + n - row);

            for (int col = 1; col <= row; col++) {
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }
    }
}