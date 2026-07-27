package binary_search;

public class CeilingNumber {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9};
        int ansCeil = findCeilingNumber(arr, 6);
        System.out.println(ansCeil);

        int ansFloor = FloorNumber.findFloorNumber(arr, 6);
        System.out.println(ansFloor);
    }

    public static int findCeilingNumber (int[] arr, int target){

        if (arr == null || arr.length == 0){
            System.out.println("The array is null or empty.");
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        if (target < arr[start] || target > arr[end]){
            return -1;
        }

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
