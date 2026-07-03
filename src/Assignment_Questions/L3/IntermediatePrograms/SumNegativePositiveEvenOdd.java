package Assignment_Questions.L3.IntermediatePrograms;

import java.util.Scanner;

/*
    Write a program to print the sum of negative numbers,
    sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user.
    The list terminates when the user enters a zero.
 */
public class SumNegativePositiveEvenOdd {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter numbers [Exit press 0]");

        int negative = 0;
        int odd = 0;
        int even = 0;

        while (true) {

            int num = in.nextInt();
            if (num == 0) break;

            if (num < 0) {
                negative += num;
            } else {
                if (num % 2 == 0) {
                    even += num;
                } else {
                    odd += num;
                }
            }

        }

        System.out.println("Sum of Negative Numbers = " + negative);
        System.out.println("Sum of Positive Even Numbers = " + even);
        System.out.println("Sum of Positive Odd Numbers = " + odd);    }
}
