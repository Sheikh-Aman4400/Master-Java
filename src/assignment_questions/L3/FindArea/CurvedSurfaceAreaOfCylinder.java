package assignment_questions.L3.FindArea;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter the radius of Cylinder : ");
        float radius = input.nextFloat();
        System.out.print("Please, Enter the height of Cylinder : ");
        float height = input.nextFloat();
        System.out.printf("The Curved Surface Area of Cylinder -> %.2f " , ( (2 * Math.PI) * radius * height) );
    }
}
