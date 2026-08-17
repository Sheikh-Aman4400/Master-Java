package bit_manipulation;

import java.util.Scanner;

public class UniqueInThriceNum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = in.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        in.close();

        System.out.println("Unique Number: " + findUnique(nums));
    }

    private static int findUnique(int[] nums) {

        int ans = 0;

        // Check every bit position
        for (int i = 0; i < 32; i++) {

            int count = 0;

            // Count how many numbers have the ith bit set
            for (int num : nums) {

                if (((num >> i) & 1) == 1) {
                    count++;
                }
            }

            // If remainder is 1, set this bit in answer
            if (count % 3 != 0) {
                ans |= (1 << i);
            }
        }

        return ans;
    }
}