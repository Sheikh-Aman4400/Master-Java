package Assignment_Questions.L3.FindVolume;

import java.util.Scanner;

public class VolumeOfPyramid {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter base length of Pyramid : ");
        float baseLength = input.nextFloat();
        System.out.print("Please, Enter base width of Pyramid : ");
        float baseWidth = input.nextFloat();
        System.out.print("Please, Enter height of Pyramid : ");
        float height = input.nextFloat();
        System.out.printf("The Volume of Pyramid -> %.2f" , ((baseLength * baseWidth) * height) / 3 );
    }
}
