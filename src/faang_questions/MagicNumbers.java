package faang_questions;

import java.util.Scanner;

public class MagicNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = in.nextInt();
        in.close();

        System.out.println( "Magic Number -> " + magic(num) );
    }

    private static int magic(int num) {

        if (num <= 0) {
            throw new IllegalArgumentException("Number must be positive.");
        }

        int ans = 0;
        int base = 5;

        while (num > 0){

            int lastDigit = num & 1;
            num >>= 1;
            ans += lastDigit * base;
            base *= 5;
        }

        return ans;
    }
}
