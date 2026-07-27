package assignment_questions.L3.FindArea;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter the side of Equilateral Triangle : ");
        float side = input.nextFloat();
        System.out.printf("The area of EquilateralTriangle -> %.2f " , (Math.sqrt(3) / 4) * (Math.pow(side, 2)) );
    }
}
