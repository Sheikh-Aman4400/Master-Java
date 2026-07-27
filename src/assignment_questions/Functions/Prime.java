package assignment_questions.Functions;

//  Define a method to find out if a number is prime or not.

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, enter number to find out it is prime or not.");
        System.out.print("Number -> ");
        System.out.println(isPrime(in.nextInt()));
    }

    public static boolean isPrime(int n){
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
