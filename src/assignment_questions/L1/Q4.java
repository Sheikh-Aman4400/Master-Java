package assignment_questions.L1;

//  Q4 -> Take 2 numbers as inputs and find their HCF and LCM.

import java.util.Scanner;

public class Q4 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers to find HCF and LCM.");
        System.out.print("Num 01 : ");
            int num1 = input.nextInt();
            int a = num1;
        System.out.print("Num 02 : ");
            int num2 = input.nextInt();
            int b = num2;

        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        int hcf = a;
        int lcm = (num1 * num2) / hcf;

        System.out.println("HCF : " + hcf);
        System.out.println("LCM : " + lcm);
    }
}
