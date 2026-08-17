package bit_manipulation;

import java.util.Scanner;

public class FindDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();

        System.out.print("Enter base : ");
        int base = sc.nextInt();

        sc.close();

        System.out.println("Digits -> " + getDigits(num, base));
    }

    private static int getDigits(int num, int base) {
        return (int) ( Math.log(num) / Math.log(base) ) + 1;
    }
}
