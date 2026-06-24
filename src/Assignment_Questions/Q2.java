package Assignment_Questions;
//  Q2 - Take two numbers and print the sum of both.

import java.util.Scanner;

public class Q2 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter two numbers to get the sum of it.");

        System.out.println("Enter number - 01");
        int num1 = in.nextInt();

        System.out.println("Enter number - 02");
        int num2 = in.nextInt();

        System.out.println("The sum of given numbers -> " + (num1 + num2));

    }
}
