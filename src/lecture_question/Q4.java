package lecture_question;

//  Q4 -> Find the occurrence of a number , take number input from user.

import java.util.Scanner;

public class Q4 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please, Enter the series of numbers [Input 10 numbers] : ");
        int[] series = new int[10];
        for (int i = 0; i <= series.length - 1; i++) {
            series[i] = input.nextInt();
        }

        System.out.print("Enter number to check it's occurrence : ");
        int num = input.nextInt();

        int count = 0;
            for (int i = 0; i <= series.length - 1; i++){
                if (num == series[i]){
                    count++;
                }
            }

        System.out.println(num + " occurs " + count + " times in the series.");
    }
}
