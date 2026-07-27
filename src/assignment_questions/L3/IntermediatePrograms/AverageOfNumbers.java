package assignment_questions.L3.IntermediatePrograms;

//  Calculate Average Of N Numbers

import java.util.Scanner;

public class AverageOfNumbers {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        System.out.println("Please, Enter numbers to calculate the average [Exit Press -> 0] : ");

            while (true){
                int num = input.nextInt();
                    if (num == 0){
                        System.out.println("The Average -> " + (sum / count));
                        break;
                    }else {
                        sum += num;
                        count++;
                    }
            }
    }
}
