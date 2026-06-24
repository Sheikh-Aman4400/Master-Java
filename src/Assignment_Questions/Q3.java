package Assignment_Questions;
//  Q3 - Take a number as input and print the multiplication table for it.

import java.util.Scanner;

public class Q3 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the number for Multiplication table.");
        int num = in.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i) );
        }

    }
}
