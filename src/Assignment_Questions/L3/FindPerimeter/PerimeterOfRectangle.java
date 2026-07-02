package Assignment_Questions.L3.FindPerimeter;

import java.util.Scanner;

public class PerimeterOfRectangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter length of Rectangle : ");
        float length = input.nextFloat();
        System.out.print("Please, Enter width of Rectangle : ");
        float width = input.nextFloat();
        System.out.printf("The perimeter of Rectangle -> %.2f " , (2 * (length + width)));
    }
}
