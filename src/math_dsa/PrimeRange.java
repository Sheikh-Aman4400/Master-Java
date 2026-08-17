package math_dsa;

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = in.nextInt();
        in.close();

        boolean[] primes = new boolean[num + 1];
        isPrime(num, primes);
    }

    //  This is the Sieve of Eratosthenes, one of the most important algorithms in DSA.
    private static void isPrime(int num, boolean[] primes){

        if (num <= 1)    throw new IllegalArgumentException("Number must be greater than 1.");

        for (int i = 2; i * i <= num; i++){

            if (!primes[i]){
                for (int j = i * 2; j <= num; j += i) {
                    primes[j] = true;
                }
            }

        }

        for (int i = 2; i <= num; i++){
            if (!primes[i]){
                System.out.print(i + " ");
            }
        }

    }
}
