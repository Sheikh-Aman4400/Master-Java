package assignment_questions.L3.FindPerimeter;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter side of EquilateralTriangle : ");
        float side = input.nextFloat();
        System.out.printf("The perimeter of EquilateralTriangle -> %.2f " , (3 * side));
    }
}
