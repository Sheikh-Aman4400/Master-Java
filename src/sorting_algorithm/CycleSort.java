package sorting_algorithm;
//  "Use Cyclic Sort when the array contains numbers in a fixed range (1 to n or 0 to n)
//  and you need to place every number at its correct index."

import java.util.ArrayList;
import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {

        int[] nums = {3, 0, 1};
        cyclicSort(nums);

        System.out.println(Arrays.toString(nums));
    }

    private static void cyclicSort (int[] arr){

        if (arr == null || arr.length <= 1){
            return;
        }

        int index = 0;
        while (index < arr.length){

            int rightIndex = arr[index] - 1;

            if (arr[index] != arr[rightIndex]){
                swap(arr, index, rightIndex);
            } else {
                index++;
            }
        }
    }
    private static void swap (int[] arr, int index1, int index2){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
