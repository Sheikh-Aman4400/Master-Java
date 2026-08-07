package sorting_algorithm;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class SelectionSort {
    static void main(String[] args) {

        int[] nums = {1, -5, -3, 4, 2};
        selection(nums);

        System.out.println(Arrays.toString(nums));

    }
    private static void selection (int[] arr){

        if (arr == null || arr.length <= 1){
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {

            int end = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, end);
            swap(arr, maxIndex, end);

        }
    }
    private static int getMaxIndex (@NotNull int[] arr, int end){
        int max = 0;

        for (int i = 0; i <= end; i++) {

            if (arr[i] > arr[max]){
                max = i;
            }
        }

        return max;
    }
    private static void swap(@NotNull int[] arr, int maxElementIndex, int index){

        int temp = arr[maxElementIndex];
        arr[maxElementIndex] = arr[index];
        arr[index] = temp;

    }
}
