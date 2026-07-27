package assignment_questions.L3.IntermediatePrograms;

import java.util.Scanner;

public class VowelOrConsonant {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please, enter alphabet to check whether it a vowel or consonant : ");
        char ch = in.next().trim().charAt(0);
        vowels(ch);
    }

    static void vowels (char ch){
        char duplicate = Character.toLowerCase(ch);

        switch (duplicate){
            case 'a':
                System.out.println("Its a Vowel.");
                break;
            case 'e':
                System.out.println("Its a Vowel.");
                break;
            case 'i':
                System.out.println("Its a Vowel.");
                break;
            case 'o':
                System.out.println("Its a Vowel.");
                break;
            case 'u':
                System.out.println("Its a Vowel.");
                break;
            default:
                System.out.println("It's a Consonant.");
        }
    }
}
