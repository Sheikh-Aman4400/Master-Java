package Assignment_Questions.Functions;

//  Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

import java.util.Scanner;

public class Circles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, enter radius to find out area and circumference of a circle.");
        System.out.print("Radius -> ");
        float radius = in.nextFloat();

        System.out.printf("Circumference of Circle : %.2f" , findCircumference(radius) );
        System.out.println();
        System.out.printf("Area of Circle : %.2f" , areaOfCircle(radius));

    }

    public static float findCircumference(float r){
        return (float) (2 * Math.PI * r);
    }

    public static float areaOfCircle(float r){
        return (float) (Math.PI * (Math.pow(r, 2)));
    }
}
