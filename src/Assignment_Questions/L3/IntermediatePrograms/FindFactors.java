package Assignment_Questions.L3.IntermediatePrograms;

//  Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class FindFactors {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please, Enter number to find it's Factors : ");
        int num = input.nextInt();

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.print(num);
    }
}
