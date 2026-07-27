package assignment_questions.L3.FindPerimeter;

import java.util.Scanner;

public class PerimeterOfCircle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter radius of circle : ");
        float radius = input.nextFloat();
        System.out.printf("The perimeter of circle -> %.2f " , (2 * Math.PI * radius));
    }
}
