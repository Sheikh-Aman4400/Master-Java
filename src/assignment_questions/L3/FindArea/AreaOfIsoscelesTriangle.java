package assignment_questions.L3.FindArea;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter the base of isosceles triangle : ");
        float base = input.nextFloat();
        System.out.print("Please, Enter the side of isosceles triangle : ");
        float side = input.nextFloat();
        double height = Math.sqrt((side * side) - ((base * base) / 4));
        System.out.printf("The area of isosceles triangle -> %.2f " , (base * height) / 2 );
    }
}
