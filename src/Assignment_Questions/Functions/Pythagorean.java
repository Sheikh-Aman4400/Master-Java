package Assignment_Questions.Functions;

//  Write a function to check if a given triplet is a Pythagorean triplet or not.
//  (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, enter all sides.");
        System.out.print("Side 01 -> ");
        int s1 = in.nextInt();
        System.out.print("Side 02 -> ");
        int s2 = in.nextInt();
        System.out.print("Side 03 -> ");
        int s3 = in.nextInt();

        System.out.println(pythagoreanTriplet(s1, s2, s3));
    }

    public static boolean pythagoreanTriplet(int n1, int n2, int n3){

        int max = Math.toIntExact(MinMax.max(n1, n2, n3));

        if (max == n1) {
            return n2 * n2 + n3 * n3 == n1 * n1;
        } else if (max == n2) {
            return n1 * n1 + n3 * n3 == n2 * n2;
        } else {
            return n1 * n1 + n2 * n2 == n3 * n3;
        }
    }
}
