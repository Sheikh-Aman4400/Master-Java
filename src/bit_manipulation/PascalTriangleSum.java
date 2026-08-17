package bit_manipulation;

import java.util.Scanner;

public class PascalTriangleSum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter row number (0-indexed): ");
        int n = in.nextInt();
        in.close();

        int sum = 1 << n;

        System.out.println("Sum of row " + n + " = " + sum);
    }
}