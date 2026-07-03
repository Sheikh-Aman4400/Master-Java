package Assignment_Questions.L3.IntermediatePrograms;

//  Calculate Distance Between Two Points.

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter the co-ordinates to find distance between two points : ");

        System.out.print(" x1 -> ");
        double x1 = input.nextDouble();
        System.out.print(" x2 -> ");
        double x2 = input.nextDouble();

        System.out.print(" y1 -> ");
        double y1 = input.nextDouble();
        System.out.print(" y2 -> ");
        double y2 = input.nextDouble();

        double distance = Math.sqrt(
                Math.pow((x1 - x2) , 2)
                        +
                Math.pow((y1 - y2) , 2)
        );
        System.out.println("The distance between two points -> " + distance);
    }
}
