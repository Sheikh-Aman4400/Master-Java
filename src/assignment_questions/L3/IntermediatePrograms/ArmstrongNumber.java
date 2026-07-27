package assignment_questions.L3.IntermediatePrograms;

import java.util.Scanner;

public class ArmstrongNumber {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter number to check whether it's Armstrong or not.");

        System.out.print("Number : ");
        String value = in.nextLine();

        int num = Integer.parseInt(value);
        int sum = 0;

        while ( num != 0){
            int digit = num % 10;
            sum += (int) Math.pow(digit, value.length());
            num /= 10;
        }

            if (Integer.parseInt(value) == sum){
                System.out.println("It's an Armstrong Number");
            }  else {
                System.out.println("It's not an Armstrong Number");
            }
    }
}
