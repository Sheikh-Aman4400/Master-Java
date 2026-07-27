package assignment_questions.L3.IntermediatePrograms;

import java.util.Scanner;

public class HCF_LCM {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 01 -> ");
        int num1 = in.nextInt();
        int a = num1;

        System.out.print("Enter number 02 -> ");
        int num2 = in.nextInt();
        int b = num2;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int hcf = a;
        int lcm = (num1 * num2) / hcf;

        System.out.println("HCF : " + hcf);
        System.out.print("LCM : " + lcm);

    }
}
