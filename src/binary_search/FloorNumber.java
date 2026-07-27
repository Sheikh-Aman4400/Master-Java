package binary_search;

public class FloorNumber {
    public static int findFloorNumber (int[] arr, int target){

        if (arr == null || arr.length == 0){
            System.out.println("Array is null or empty.");
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        if (target < arr[start] || target > arr[end]){
            return -1;
        }

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[end];
    }
}
