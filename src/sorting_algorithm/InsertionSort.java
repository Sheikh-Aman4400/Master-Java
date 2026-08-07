package sorting_algorithm;
import org.jetbrains.annotations.NotNull;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] nums = {1, 5, -3, 4, 2};
        insertion(nums);

        System.out.println(Arrays.toString(nums));
    }

    private static void insertion (int[] arr){

        if (arr == null || arr.length <= 1){
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {

                if (arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }

        }
    }
    private static void swap (@NotNull int[] arr, int index1, int index2){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
