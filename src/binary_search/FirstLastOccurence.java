package binary_search;

import java.util.Arrays;

public class FirstLastOccurence {
    public static void main(String[] args) {

        int[] arr = {5,7,7,8,8,10};
        int target = 8;

        int[] result = searchRange(arr, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        int firstOccurence = binarySearch(nums, target, true);

        if (firstOccurence != -1){
            ans[0] = firstOccurence;
            ans[1] = binarySearch(nums, target, false);
        } else {
            return ans;
        }

        return ans;
    }

    private static int binarySearch (int[] arr, int target, boolean startIndex){

        int start = 0,
                ans = -1,
                end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] > target){
                end = mid - 1;
            } else if (arr[mid] < target){
                start = mid + 1;
            } else {
                ans = mid;

                if (startIndex){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }

        return ans;
    }
}
