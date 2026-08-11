package patterns.half02;

/*

21.    1
       2  3
       4  5  6
       7  8  9  10
       11 12 13 14 15

*/

public class Pattern21 {

    public static void main(String[] args) {
        p21(5);
    }

    static void p21(int n) {

        int value = 1;
        for (int i = 0; i <= n; i++) {

            for (int j = 0; j < i; j++) {

                if ( i != n){
                    System.out.print(value + "  ");
                    value++;
                } else {
                    System.out.print(value + " ");
                    value++;
                }
            }

            System.out.println();
        }
    }
}