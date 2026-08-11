package recursion;

public class BinarySearch {
    static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 6, 7, 8, 9};
        int ans = search(arr, 0, arr.length - 1, 6);
        System.out.println(ans);
    }

    static int search (int[] arr, int start, int end, int target){

        if (start > end)    return -1;

        int mid = start + (end - start) / 2;
        if (arr[mid] == target)    return mid;
        if (target < arr[mid])  return search(arr, start, mid - 1, target);

        return search(arr, mid + 1, end, target);
    }
}
