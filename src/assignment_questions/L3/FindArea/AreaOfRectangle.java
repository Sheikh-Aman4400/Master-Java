package assignment_questions.L3.FindArea;

import java.util.Scanner;

public class AreaOfRectangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter the length of rectangle : ");
        float length = input.nextFloat();
        System.out.print("Please, Enter the width rectangle : ");
        float width = input.nextFloat();
        System.out.printf("The area of rectangle -> %.2f " , (length * width) );
    }
}
