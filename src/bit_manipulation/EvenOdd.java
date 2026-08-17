package bit_manipulation;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        input.close();

        if (num < 0){
            System.out.println("Negative numbers are not allowed");
        } else {
            System.out.println(
                    isOdd(num) ? "The given number is odd." : "The given number is even."
            );
        }
    }

    private static boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
