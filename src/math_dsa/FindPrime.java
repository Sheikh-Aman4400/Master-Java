package math_dsa;

import java.util.Scanner;

public class FindPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = in.nextInt();
        in.close();

        System.out.println(isPrime(num));
    }

    private static boolean isPrime(int num){

        if (num <= 1)    throw new IllegalArgumentException("Number must be greater than 1.");

        for (int i = 2; i * i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }
}
