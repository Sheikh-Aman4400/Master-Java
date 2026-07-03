package Assignment_Questions.L3.IntermediatePrograms;

import java.util.Scanner;

public class Findpalindrome {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please, enter a string to check whether it's Palindrome or not -> ");
        String str = in.nextLine();

            if (str.equalsIgnoreCase(reverse(str))){
                System.out.println("It's a Palindrome");
            } else {
                System.out.println("It's not a Palindrome");
            }

    }
    static String reverse (String str){
        String rev ="";
           for (int i = str.length() - 1; i >= 0; i--){
               rev += str.charAt(i);
           }
        return rev;
    }
}
