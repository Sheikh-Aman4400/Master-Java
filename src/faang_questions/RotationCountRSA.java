package faang_questions;
//  Find the Rotation Count in Rotated Sorted array.

public class RotationCountRSA {
    public static void main(String[] args) {
        int[] nums = { 16, 18,2, 3, 6, 12};
        System.out.println(findRotation(nums));
    }

    public static int findRotation (int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

}
