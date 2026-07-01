package Assignment_Questions.L2;

//  Q8 -> To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Q8 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter to check whether it's Palindrome or not : ");
        String pd = input.nextLine();
        boolean isPalindrome = true;

        for (int i = 0; i < pd.length() / 2; i++){
            if ( pd.charAt( i ) != pd.charAt( pd.length() - 1 - i )){
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome){
            System.out.println("It's a Palindrome");
        } else {
            System.out.println("It's not a Palindrome");
        }
    }
}
