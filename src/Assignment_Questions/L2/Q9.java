package Assignment_Questions.L2;

//  Q9 -> To find Armstrong Number between two given number.

import java.util.Scanner;

public class Q9 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter number to find Armstrong numbers.");

        System.out.print("Start number : ");
            int start = input.nextInt();
        System.out.print("End number : ");
            int end = input.nextInt();


        while (start <= end){

            int original = start;
            int temp = start;
            int sum = 0;
            int digitLen = String.valueOf(start).length();

                while (temp > 0){
                    int digit = temp % 10;
                    sum += Math.pow(digit, digitLen);
                    temp = temp / 10;
                }

                if (sum == original){
                    System.out.print(original + " ");
                }

                start++;
        }
    }
}
