package Assignment_Questions.L1;
//  Q1 - Input a year and find whether it is a leap year or not.


import java.util.Scanner;

public class Q1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter year to check whether it's leap year or not. ");
        int year = sc.nextInt();

            if ((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0)){
                System.out.println(year + " - It's a Leap Year.");
            }else {
                System.out.println("It's not a Leap Year.");
            }

    }

}
