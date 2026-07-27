package assignment_questions.Functions;

//  Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, enter a number to find out whether it is even or odd.");
        System.out.print("Number -> ");
        printEvenOdd(in.nextLong());
    }

    public static void printEvenOdd(long num){
        System.out.println(num % 2 == 0 ? "It's Even" : "It's Odd");
    }
}
