package assignment_questions.L3.IntermediatePrograms;

import java.util.Scanner;

public class ReverseString {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please, enter your name : ");
        String name = in.nextLine();
        System.out.println("Reversed Name : " + reverse(name));

    }

    static String reverse (String name){
        String rev ="";
            for (int i = name.length() - 1; i >= 0; i--){
                rev += name.charAt(i);
            }
        return rev;

    }
}
