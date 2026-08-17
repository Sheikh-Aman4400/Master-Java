package math_dsa;

import java.util.Scanner;

public class GCD_HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two numbers : ");
        int n1 = Math.abs( in.nextInt() );
        int n2 = Math.abs( in.nextInt() );
        in.close();

        System.out.println("HCF -> " + getHCF(n1, n2));
    }

    public static int getHCF(int n1, int n2) {
        if (n1 == 0 && n2 == 0) throw new IllegalArgumentException("GCD is undefined for 0 and 0");
        if (n1 == 0)    return n2;
        return getHCF(n2 %  n1, n1);
    }
}
