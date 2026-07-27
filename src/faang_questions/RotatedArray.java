package faang_questions;
import org.jetbrains.annotations.NotNull;

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 0, 2, 4};
        int[] nums = {1, 3, 5, 6, 7, 7, 7, 7, 7, 0, 2, 4};
        int target1 = 0;
        int target2 = 7;

        // rotated array
        int ans = search1(arr, target1);
        System.out.println(ans);

        // duplicates rotated array
        int res = search2(nums, target2);
        System.out.println(res);
    }

    public static int search2(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int pivot = DuplicateRotatedArray.findPivotWithDuplicates(arr);
        int leftSearch = binarySearch(arr, target, 0, pivot - 1);

        if (leftSearch != -1) {
            return leftSearch;
        }

        return binarySearch(arr, target, pivot, arr.length - 1);
    }

    public static int search1(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int pivot = findPivot(arr);

        int leftSearch = binarySearch(arr, target, 0, pivot - 1);

        if (leftSearch != -1) {
            return leftSearch;
        }

        return binarySearch(arr, target, pivot, arr.length - 1);
    }

    public static int findPivot(@NotNull int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else if (arr[mid] < arr[end]) {
                end = mid;
            } else {
                end--;
            }
        }

        return start;
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}