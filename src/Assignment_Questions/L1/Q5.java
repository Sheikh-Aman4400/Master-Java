package Assignment_Questions.L1;

import java.util.Scanner;


//  Q5 -> Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter numbers to get the sum of all : ");

        int sum = 0;
            while (true){
                String num = input.next();
                   if (num.equalsIgnoreCase("x")){
                        break;
                   }else {
                       sum += Integer.parseInt(num);
                   }
            }
        System.out.print("The sum of given numbers : " + sum);

    }
}
