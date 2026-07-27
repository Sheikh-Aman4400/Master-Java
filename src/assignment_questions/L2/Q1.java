package assignment_questions.L2;

//  Q1 -> Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class Q1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please , Enter number to check whether it's even or odd : ");
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("It's an Even number.");
        } else {
            System.out.println("It's an Odd number.");
        }
    }
}
