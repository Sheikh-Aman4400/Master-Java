package assignment_questions.L3.FindArea;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter the side of Cube : ");
        float side = input.nextFloat();
        System.out.printf("The Total Surface Area of Cube -> %.2f " , (Math.pow(side, 2) * 6) );
    }
}
