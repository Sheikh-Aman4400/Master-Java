package Lecture_Question;

//  Convert temperature from Celsius to Fahrenheit.

import java.util.Scanner;

public class Q2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter temperature in Celsius to convert into Fahrenheit : ");
        System.out.println(" F : " + (( input.nextFloat() * 9 / 5) + 32) );
    }
}
