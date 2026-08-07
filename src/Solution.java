import java.util.Arrays;

class Solution {
    static void main(String[] args) {
        int[] n = {4,5,8};
        int[] n1 = {10,9,1,};

        merge(n, 3, n1, 3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if (nums1 == null || nums2 == null){
            return;
        }

        int[] result = Arrays.copyOf(nums1, m + n);

        for (int i = m; i < result.length; i++){
            result[i] = nums2[i - m];
        }

        Arrays.sort(result);
        nums1 = result;
    }
}