package math_dsa;

import java.util.Scanner;

public class PreciseSQRT {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = in.nextInt();
        in.close();

        if (num < 0) {
            System.out.println("Square root of a negative number is not defined.");
            return;
        }

        int root = binarySearch(num);
        double ans = getSQRT(num, root, 3); // 3 decimal places

        System.out.printf("Square Root = %.2f" , ans);
    }

    private static int binarySearch(int num) {

        int start = 0;
        int end = num;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if ((long) mid * mid == num) {
                return mid;
            }

            if ((long) mid * mid > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return end;
    }

    private static double getSQRT(int num, int root, int precision) {

        double ans = root;
        double increment = 0.1;

        for (int i = 0; i < precision; i++) {

            while (ans * ans <= num) {
                ans += increment;
            }

            ans -= increment;
            increment /= 10;
        }

        return ans;
    }
}