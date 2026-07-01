package Assignment_Questions.L2;

//  Q5 -> Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Q5 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program is used to find the largest number.");

        System.out.print("Enter number 01 : ");
        int num1 = input.nextInt();
        System.out.print("Enter number 02 : ");
        int num2 = input.nextInt();

        System.out.println("Largest number : " + Math.max(num1, num2));
    }
}
