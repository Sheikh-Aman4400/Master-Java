package Assignment_Questions.Functions;

//  Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, enter two numbers for their product.");
        System.out.print("Number 01 -> ");
        long num1 = in.nextLong();
        System.out.print("Number 02 -> ");
        long num2 = in.nextLong();

        System.out.println("PRODUCT : " + getProduct(num1, num2));
    }

    public static long getProduct(long n1, long n2){
        return Math.multiplyExact(n1, n2);
    }
}
