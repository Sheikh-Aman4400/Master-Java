package binary_search;

public class OrderAgnosticBS {
    public static void main(String[] args) {

        int[] ascending = {2, 5, 8, 12, 16, 23, 38, 56};
        System.out.println(agnosticBS(ascending, 23)); // 5

        int[] descending = {90, 75, 60, 45, 30, 15, 5};
        System.out.println(agnosticBS(descending, 45)); // 3

        int[] oneElement = {10};
        System.out.println(agnosticBS(oneElement, 10)); // 0

        int[] notFound = {1, 4, 7, 10, 13};
        System.out.println(agnosticBS(notFound, 8)); // -1

        int[] empty = {};
        System.out.println(agnosticBS(empty, 5)); // -1

    }

    public static int agnosticBS (int[] array, int target){

        if(array == null || array.length == 0){
            System.out.println("Array is null or empty");
            return -1;
        }

        int start = 0;
        int end = array.length - 1;
        boolean isAsc = array[start] <= array[end];

            while (start <= end){
                int mid = start + (end - start) / 2;

                if(array[mid] == target) {
                    System.out.println("Target found.");
                    return mid;
                }

                if (isAsc){

                    if (target < array[mid]){
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }

                } else {

                    if (target < array[mid]){
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
        System.out.println("Target not found.");
        return -1;
    }
}
