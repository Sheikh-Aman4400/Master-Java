package assignment_questions.Functions;
import java.util.*;

// Write a function that returns all prime numbers between two given numbers.

public class PrimeSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, enter two numbers to find out the prime series.");
        System.out.print("Number 01 -> ");
        int n1 = in.nextInt();

        System.out.print("Number 02 -> ");
        int n2 = in.nextInt();

        primeSeries(n1, n2);
    }

    public static void primeSeries(int a, int b) {

        if (a < 1 || b < 1) {
            System.out.println("Invalid Input");
            return;
        }

        // Swap if the first number is greater than the second
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.print("[ ");

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("]");
    }

    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}