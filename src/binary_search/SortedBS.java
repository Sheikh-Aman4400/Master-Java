package binary_search;

public class SortedBS {
    public static void main(String[] args) {
        int[] nums = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        int ans = findTargetBS(nums, 71);
        System.out.println(ans);
    }

    public static int findTargetBS(int[] arr, int target){

        if (arr == null || arr.length == 0){
            System.out.println("Array is null or empty.");
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + ( end - start ) / 2;

                if (target < arr[mid]){
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    System.out.println("Target found :- ");
                    return mid;
                }
        }
        System.out.println("Target not found.");
        return -1;
    }
}
