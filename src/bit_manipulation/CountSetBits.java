package bit_manipulation;

import java.util.Scanner;

public class CountSetBits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        System.out.println("Number of set bits: " + countSetBits(num));
    }

    private static int countSetBits(int num) {

        if (num < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed.");
        }

        int count = 0;

        while (num > 0) {
            num = num & (num - 1);
            count++;
        }

        return count;
    }
}