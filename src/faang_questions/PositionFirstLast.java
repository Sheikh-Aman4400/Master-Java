package faang_questions;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class PositionFirstLast {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;

        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        result[0] = search(nums, target, true);

        if (result[0] != -1) {
            result[1] = search(nums, target, false);
        }

        return result;
    }

    public static int search(@NotNull int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;

                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}