package Assignment_Questions.Functions;

//  Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.Scanner;

public class SumNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, enter two numbers.");
        System.out.print("Number 01 -> ");
        long num1 = in.nextLong();
        System.out.print("Number 02 -> ");
        long num2 = in.nextLong();

        System.out.println("SUM : " + sum(num1, num2));

    }

    public static long sum(long n1, long n2){
        return Math.addExact(n1, n2);
    }
}
