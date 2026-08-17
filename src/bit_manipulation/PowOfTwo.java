package bit_manipulation;

import java.util.Scanner;

public class PowOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();
        sc.close();

        System.out.println(isPowOfTwo(num));
    }

    private static boolean isPowOfTwo(int num) {

        if (num <= 0){
            throw new IllegalArgumentException("Number must be positive.");
        }

        return (num & (num - 1)) == 0;
    }
}
