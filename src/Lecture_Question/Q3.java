package Lecture_Question;

//  Q3 -> Check the case of alphabet , take input from user

import java.util.Scanner;

public class Q3 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter an alphabet to check it's case : " );
        char alpha = input.next().trim().charAt(0);

        if (Character.isLowerCase(alpha)){
            System.out.println("Lower Case Alphabet.");
        }else {
            System.out.println("Upper Case Alphabet.");
        }
    }
}
