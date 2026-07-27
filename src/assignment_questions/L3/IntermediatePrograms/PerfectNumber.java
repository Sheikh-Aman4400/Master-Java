package assignment_questions.L3.IntermediatePrograms;

import java.util.Scanner;

public class PerfectNumber {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number to check it's a perfect number or not : ");
        int num = in.nextInt();
        int sum = 0;

        for (int i = 1; i <= num / 2; i++){
            if (num % i == 0){
                sum += i;
            }
        }

        if (num == sum ){
            System.out.println("It's a Perfect Number");
        } else {
            System.out.println("It's not a Perfect Number");

        }

    }
}
