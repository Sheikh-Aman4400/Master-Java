package bit_manipulation;

import java.util.Scanner;

public class FindUnique {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter array size.");
        int len = in.nextInt();

        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = in.nextInt();
        }
        in.close();

        int ans = unique (nums);
        System.out.println(
              ans >= 0 ? "The Unique number found : " + ans :  "The Unique number not found."
        );
    }

    private static int unique(int[] nums) {
        int findOut = 0;

        for (int num : nums){
            findOut ^= num;
        }

        return findOut;
    }
}
