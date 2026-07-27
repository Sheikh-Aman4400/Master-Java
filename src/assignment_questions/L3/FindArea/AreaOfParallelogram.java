package assignment_questions.L3.FindArea;

import java.util.Scanner;

public class AreaOfParallelogram {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter the base of parallelogram : ");
        float base = input.nextFloat();
        System.out.print("Please, Enter the height of parallelogram : ");
        float height = input.nextFloat();
        System.out.printf("The area of parallelogram -> %.2f " , (base * height) );
    }
}
