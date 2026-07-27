import java.util.Arrays;

class Solution {
    public static void main(String[] args) {

        int[] n1 = {1,10,4,4,2,7};
        int[] n2 = {9,3,5,1,7,4};

        minAbsoluteSumDiff(n1, n2);
    }

    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {

        int MOD = 1_000_000_007;
        int n = nums1.length;

        int[] sorted = nums1.clone();
        Arrays.sort(sorted);

        long total = 0;
        int maxGain = 0;

        for (int i = 0; i < n; i++) {

            int currentDiff = Math.abs(nums1[i] - nums2[i]);
            total += currentDiff;

            int idx = Arrays.binarySearch(sorted, nums2[i]);

            if (idx < 0) {
                idx = -idx - 1;
            }

            // Candidate on the right
            if (idx < n) {
                int newDiff = Math.abs(sorted[idx] - nums2[i]);
                maxGain = Math.max(maxGain, currentDiff - newDiff);
            }

            // Candidate on the left
            if (idx > 0) {
                int newDiff = Math.abs(sorted[idx - 1] - nums2[i]);
                maxGain = Math.max(maxGain, currentDiff - newDiff);
            }
        }

        return (int)((total - maxGain) % MOD);
    }
}