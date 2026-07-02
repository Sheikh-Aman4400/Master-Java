package Assignment_Questions.L3.FindArea;

import java.util.Scanner;

public class AreaOfRhombus {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter the diagonal:01 of Rhombus : ");
        float diagonal01 = input.nextFloat();
        System.out.print("Please, Enter the diagonal:02 of Rhombus : ");
        float diagonal02 = input.nextFloat();
        System.out.printf("The area of Rhombus -> %.2f " , (diagonal01 * diagonal02) / 2 );
    }
}
