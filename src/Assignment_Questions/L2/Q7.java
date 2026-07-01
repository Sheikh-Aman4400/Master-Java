package Assignment_Questions.L2;

//  Q7 -> To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Q7 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter number to calculate Fibonacci series : ");
        int num = input.nextInt();

        int count = 0;
        int first = 0;
        int second = 1;
        int next;

        while (count < num){
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
            count++;
        }
    }
}
