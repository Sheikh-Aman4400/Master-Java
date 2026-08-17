package bit_manipulation;

import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = in.nextInt();
        System.out.print("Enter ith bit : ");
        int bit = in.nextInt();
        in.close();

        System.out.println( "The ith Bit : " + getBit (num, bit));
        System.out.println( "The Set Bit : " + setBit (num, bit));
        System.out.println( "The Reset Bit : " + resetBit (num, bit));
        System.out.println( "The Toggle Bit : " + toggleBit (num, bit));

    }

    private static int getBit(int num, int bit) {
        int mask = 1 << (bit - 1);
        return (num & mask) >> (bit - 1);
    }

    private static int setBit(int num, int bit) {
        return num | (1 << (bit - 1));
    }

    private static int resetBit(int num, int bit) {
        return num & ~(1 << (bit - 1));
    }

    private static int toggleBit(int num, int bit) {
        return num ^ (1 << (bit - 1));
    }
}
