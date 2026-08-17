package bit_manipulation;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();

        System.out.print("Enter power : ");
        int pow = sc.nextInt();

        sc.close();

        System.out.println(getPow(num, pow));
    }

    private static int getPow(int num, int pow) {

        int ans = 1;
        while (pow > 0){

            if ( (pow & 1) == 1 ){
                ans *= num;
            }

            num *= num;
            pow >>= 1;
        }

        return ans;
    }
}
