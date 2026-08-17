package math_dsa;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two numbers : ");
        int n1 = Math.abs( in.nextInt() );
        int n2 = Math.abs( in.nextInt() );
        in.close();

        System.out.println("LCM -> " + getLCM(n1, n2));
    }

    private static int getLCM(int n1, int n2) {
        if (n1 == 0 && n2 ==0) throw new IllegalArgumentException("LCM is undefined for 0 and 0");
        return ( n1 / GCD_HCF.getHCF(n1, n2) ) * n2;
    }
}
