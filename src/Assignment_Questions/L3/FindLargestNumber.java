package Assignment_Questions.L3;

import java.util.Scanner;

public class FindLargestNumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter numbers to get the largest number [NOTE : enter 0 to stop] -> ");

        int largest = 0;
        while (true){
            int num = input.nextInt();
            largest = Math.max(largest, num);
            if (num == 0){
                break;
            }
        }
        System.out.println("The Largest of all numbers : " + largest);
    }
}
