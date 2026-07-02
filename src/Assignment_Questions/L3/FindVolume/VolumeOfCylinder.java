package Assignment_Questions.L3.FindVolume;

import java.util.Scanner;

public class VolumeOfCylinder {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter radius of Cylinder : ");
        float radius = input.nextFloat();
        System.out.print("Please, Enter height of Cylinder : ");
        float height = input.nextFloat();
        System.out.printf("The Volume of Cylinder -> %.2f" , (Math.PI * Math.pow(radius, 2) * height)  );
    }
}
