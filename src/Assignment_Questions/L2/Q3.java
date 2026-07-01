package Assignment_Questions.L2;

//  Q3 -> Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Q3 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program require three values to calculate simple interest.");

        System.out.print("Enter Principal : ");
            float p = input.nextFloat();
        System.out.print("Enter Time : ");
            float t = input.nextFloat();
        System.out.print("Enter Rate : ");
            float r = input.nextFloat();

        System.out.println("Simple Interest : " + ( p * r * t) / 100 );
    }
}
