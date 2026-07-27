package assignment_questions.L3.FindPerimeter;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter side of Parallelogram : ");
        float side = input.nextFloat();
        System.out.print("Please, Enter base of Parallelogram : ");
        float base = input.nextFloat();
        System.out.printf("The perimeter of Parallelogram -> %.2f " , (2 * (base + side)));
    }
}
