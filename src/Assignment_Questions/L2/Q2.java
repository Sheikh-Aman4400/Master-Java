package Assignment_Questions.L2;

//  Q2 -> Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Q2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter your name : ");
        System.out.println( "Hey " + input.nextLine() + " nice to meet you !");
    }
}
