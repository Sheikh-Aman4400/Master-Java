package patterns.half02;

/*

22.    1
       0 1
       1 0 1
       0 1 0 1
       1 0 1 0 1

*/

public class Pattern22 {

    public static void main(String[] args) {
        p22(5);
    }

    static void p22(int n) {

        int one = 1;
        int zero = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if ((i + j) % 2 == 1){
                    System.out.print(zero + "  ");
                } else {
                    System.out.print(one + "  ");
                }

            }

            System.out.println();
        }
    }
}