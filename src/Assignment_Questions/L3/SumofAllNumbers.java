package Assignment_Questions.L3;

//  Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;

public class SumofAllNumbers {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter numbers to get the sum [NOTE : enter 0 to stop] -> ");

        int sum = 0;
        while (true){
            int num = input.nextInt();
            sum += num;
                if (num == 0){
                    break;
                }
        }
        System.out.println("The sum of all numbers : " + sum);
    }
}
