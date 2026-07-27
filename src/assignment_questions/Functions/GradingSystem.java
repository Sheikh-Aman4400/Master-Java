package assignment_questions.Functions;

/*
        Write a program that will ask the user to enter his/her marks (out of 100).
        Define a method that will display grades according to the marks entered as below:


        Marks        Grade
        91-100         AA
        81-90          AB
        71-80          BB
        61-70          BC
        51-60          CD
        41-50          DD
        <=40          Fail
 */

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please, enter you marks : ");
        grades(in.nextShort());
    }

    public static void grades(short marks){
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
        } else if (marks <= 40) {
            System.out.println("FAIL");
        } else if (marks <= 50) {
            System.out.println("DD");
        } else if (marks <= 60) {
            System.out.println("CD");
        } else if (marks <= 70) {
            System.out.println("BC");
        } else if (marks <= 80) {
            System.out.println("BB");
        } else if (marks <= 90) {
            System.out.println("AB");
        } else {
            System.out.println("AA");
        }
    }
}
