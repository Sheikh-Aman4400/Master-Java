package math_dsa;

import java.util.Scanner;

public class NewtonRaphson {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = in.nextInt();

        System.out.println(raphsonMethod(num));
    }

    public static double raphsonMethod (double num){
        double root;
        double x = num;

        while (true){

            root = 0.5 * (x + ( num / x ));
            if (Math.abs(root - x) < 0.5){
                break;
            }

            x = root;
        }

        return root;
    }
}
