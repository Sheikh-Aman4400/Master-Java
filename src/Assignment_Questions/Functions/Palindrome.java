package Assignment_Questions.Functions;

//  Write a function to find if a number is a palindrome or not. Take number as parameter.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please, enter number to check it is palindrome or not : ");
        System.out.println( isPalindrome(in.nextInt()) );
    }

    public static boolean isPalindrome(int n){

        if (n < 0) {
            return false;
        }

        int org = n;
        int rev = 0;

            while (n > 0){
                int digit = n % 10;
                rev *= 10;
                rev += digit;
                n /= 10;
            }
        return org == rev;
    }
}
