package Assignment_Questions.Functions;

//  Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, enter three number to check the maximum and minimum !!!");
        System.out.print("Number - 01 : ");
        long num1 = in.nextLong();
        System.out.print("Number - 02 : ");
        long num2 = in.nextLong();
        System.out.print("Number - 03 : ");
        long num3 = in.nextLong();

        System.out.println("The Maximum Number : " + max(num1, num2, num3));
        System.out.print("The Minimum Number : " + min(num1, num2, num3));
    }

    public static long max(long n1, long n2, long n3){
         return Math.max(n1, Math.max(n2, n3));
    }

    public static long min(long n1, long n2, long n3){
        return Math.min(n1, Math.min(n2, n3));
    }
}
