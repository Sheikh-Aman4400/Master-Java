package assignment_questions.L3.IntermediatePrograms;

import java.util.Scanner;

public class CompoundInterest {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter details : ");

        System.out.print("Principle : ");
        double pr = in.nextDouble();
        System.out.print("Rate : ");
        double rate = in.nextDouble();
        System.out.print("Time : ");
        double time = in.nextDouble();

        double amount = pr * Math.pow( (1 + rate / 100) , time);
        System.out.printf("The Compound Interest -> %.2f" , (amount - pr) );
    }
}
