package Assignment_Questions.L3.FindArea;

import java.util.Scanner;

public class AreaOfCircle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter the radius of circle : ");
        float radius = input.nextFloat();
        System.out.printf("The area of circle -> %.2f " , Math.PI * (radius * radius) );
    }
}
