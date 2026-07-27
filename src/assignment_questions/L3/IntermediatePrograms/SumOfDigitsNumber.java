package assignment_questions.L3.IntermediatePrograms;

import java.util.Scanner;

public class SumOfDigitsNumber {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please, enter the digit to get it's sum : ");
        int digit = in.nextInt();
        int sum = 0;

        while (digit != 0){
            int temp = digit % 10;
            sum += temp;
            digit /= 10;
        }

        System.out.print("SUM -> " + sum);
    }
}
