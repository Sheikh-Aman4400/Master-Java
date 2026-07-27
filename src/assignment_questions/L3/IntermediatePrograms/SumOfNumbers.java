package assignment_questions.L3.IntermediatePrograms;

import java.util.Scanner;

public class SumOfNumbers {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        System.out.println("Please, Enter numbers to calculate the sum [Exit Press -> 0] : ");

        while (true){
            int num = input.nextInt();
            if (num == 0){
                System.out.println("The Sum -> " + sum);
                break;
            }else {
                sum += num;
            }
        }
    }
}
