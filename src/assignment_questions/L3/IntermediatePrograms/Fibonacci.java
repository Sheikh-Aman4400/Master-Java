package assignment_questions.L3.IntermediatePrograms;

import java.util.Scanner;

public class Fibonacci {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter number to end Fibonacci series : ");
        int end = input.nextInt();

        int first = 0;
        int second = 1;
        int next = 0;
        int count = 0;

        while (count < end){
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
            count++;

        }
    }
}
