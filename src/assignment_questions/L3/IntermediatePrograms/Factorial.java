package assignment_questions.L3.IntermediatePrograms;

//  Factorial Program In Java

import java.util.Scanner;

public class Factorial {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter the number to find Factorial : ");
        int num = input.nextInt();
        int fact = 1;

        for (int i = 1; i <= num ; i++) {
            fact *= i;
        }
        System.out.println("The Factorial of " + num + " -> " + fact);
    }
}
