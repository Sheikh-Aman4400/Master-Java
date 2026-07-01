package Lecture_Question;

//  Q5 -> Take number from user and reverse it.

import java.util.Scanner;

public class Q5 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number to reverse : ");
        long num = input.nextLong();

        long rev = 0;
            while (num > 0){
                long digit = num % 10;
                rev *= 10;
                rev += digit;
                num = num / 10;
            }
        System.out.print("The revrse of number : " + rev);
    }
}
