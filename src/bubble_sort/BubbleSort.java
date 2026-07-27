package bubble_sort;
// Remember Bubble sort is also known as Sinking Sort, Adjacent Swap Sort, Exchange Sort.

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] nums = {1, 5, 3, 4, 2};
        bubble(nums);

        System.out.println(Arrays.toString(nums));
    }

    private static void bubble(int[] arr){

        if (arr == null || arr.length <= 1){
            return;
        }

        for (int i = 0; i < arr.length - 1; i++){
            boolean swaped = false;

            for (int j = 1; j < arr.length - i; j++){

                if (arr[j - 1] > arr[j]){

                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;

                    swaped = true;
                }
            }

            if (!swaped){
                break;
            }
        }
    }
}
