package patterns.half02;

/*

33.    a
       B c
       D e F
       g H i J
       k L m N o

*/

public class Pattern33 {

    public static void main(String[] args) {
        p33(5);
    }

    static void p33(int n) {

        char ch = 'a';

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {

                if ((ch - 'a') % 2 == 0) {
                    System.out.print(Character.toLowerCase(ch) + " ");
                } else {
                    System.out.print(Character.toUpperCase(ch) + " ");
                }

                ch++;
            }

            System.out.println();
        }
    }
}