package faang_questions;
//   This is an Infinite array question but there is no such kind of array so just imagine and don't use the length method to solve this.

import org.jetbrains.annotations.NotNull;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 100;

        System.out.println(infiniteSearch(nums, target));
    }

    public static int infiniteSearch (@NotNull int[] arr, int target){
        int start = 0;
        int end = 1;

        while (arr[end] < target){
            int tempStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = tempStart;
        }

        return search(arr, target, start, end);
    }

    public static int search (int[] arr, int target, int start, int end){

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
