package assignment_questions.L3.FindVolume;

import java.util.Scanner;

public class VolumeOfPrism {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter length of Prism : ");
        float length = input.nextFloat();
        System.out.print("Please, Enter width of Prism : ");
        float width = input.nextFloat();
        System.out.print("Please, Enter height of Prism : ");
        float height = input.nextFloat();
        System.out.printf("The Volume of Prism -> %.2f" , (width * length * height) );
    }
}
