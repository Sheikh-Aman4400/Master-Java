package assignment_questions.L3.FindArea;

import java.util.Scanner;

public class AreaOfTriangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter the base of triangle : ");
        float base = input.nextFloat();
        System.out.print("Please, Enter the height of triangle : ");
        float height = input.nextFloat();
        System.out.printf("The area of triangle -> %.2f " , (0.5 * base * height) );
    }
}
