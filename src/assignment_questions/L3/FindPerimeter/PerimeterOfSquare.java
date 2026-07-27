package assignment_questions.L3.FindPerimeter;

import java.util.Scanner;

public class PerimeterOfSquare {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter side of Square : ");
        float side = input.nextFloat();
        System.out.printf("The perimeter of Square -> %.2f " , (4 * side));
    }
}
