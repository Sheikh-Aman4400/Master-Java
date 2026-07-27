package assignment_questions.L3.IntermediatePrograms;

import java.util.Scanner;

public class CheckLeapYear {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, enetr year to check whether it's a leap year or not.");
        System.out.print("YEAR -> ");
        int year = in.nextInt();

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            System.out.println("It's a Leap Year");
        } else {
            System.out.println("It's not a Leap Year");
        }
    }
}
