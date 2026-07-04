package Assignment_Questions.Functions;

//  A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please, enter your age : ");
        printEligibleOrNot(in.nextShort());
    }

    public static void printEligibleOrNot(short age){
        if (age < 1) {
            System.out.println("Invalid Input");
            return;
        }
        System.out.println(age < 18 ? "You are not eligible to vote." : "You are eligible to vote");
    }
}
