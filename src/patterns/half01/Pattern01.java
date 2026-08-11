package patterns.half01;

/*

1.  *****
    *****
    *****
    *****
    *****

 */

public class Pattern01 {
    static void main(String[] args) {

        p1(5);
    }

    static void p1 (int num){

        for (int i = 0; i < num; i++) {

            for (int j = 0; j < num; j++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
}
