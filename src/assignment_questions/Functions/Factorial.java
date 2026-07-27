package assignment_questions.Functions;

/*
        Write a program to print the factorial of a number by defining a method named 'Factorial'.
        Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
        4! = 1 * 2 * 3 * 4 = 24
        3! = 3 * 2 * 1 = 6
        2! = 2 * 1 = 2
        Also,
        1! = 1
        0! = 1
 */

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please, enter number for factorial : ");
        factorial(in.nextInt());
    }

    public static void factorial(int n){
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        if (n == 0) {
            System.out.println("0! = 1");
            return;
        }

        long fact = 1;
        System.out.print(n + "! = ");

        for (int i = 1; i <= n; i++) {
            fact *= i;
            System.out.print(i);
            if (i != n) {
                System.out.print(" * ");
            }
        }
        System.out.println(" = " + fact);
    }
}
