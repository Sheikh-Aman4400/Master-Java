package assignment_questions.L3.FindVolume;

import java.util.Scanner;

public class VolumeOfCone {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter radius of Cone : ");
        float radius = input.nextFloat();
        System.out.print("Please, Enter height of Cone : ");
        float height = input.nextFloat();
        System.out.printf("The Volume of Cone -> %.2f" , (Math.PI * Math.pow(radius, 2) * height) / 3 );
    }
}
