package assignment_questions.L3.IntermediatePrograms;

import java.util.Scanner;

public class PowerInJava {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter the number : ");
        int num = input.nextInt();
        System.out.print("Please, enter the power : ");
        int power = input.nextInt();

        System.out.printf("Answer : %.0f" , Math.pow(num, power));
    }
}
