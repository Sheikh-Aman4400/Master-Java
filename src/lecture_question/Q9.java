package lecture_question;

//  Maximum value in an array.

import java.util.Arrays;

public class Q9 {
    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.out.println("Method 01 : To find max value -> " +  maxValue(arr));
        System.out.println("Method 02 : To find max value -> " +  sortedMaxValue(arr));
    }

    public static int maxValue(int[] arr){

        int max = Integer.MIN_VALUE;
        if (arr == null) {
            System.out.println("The array is null !!!");
            return -1;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]){
                    max = arr[i];
                }
            }
        }
        return max;
    }

    public static int sortedMaxValue(int[] arr){

        if (arr == null) {
            System.out.println("The array is null !!!");
            return -1;
        } else {
            Arrays.sort(arr);
            return arr[arr.length - 1];
        }
    }
}
