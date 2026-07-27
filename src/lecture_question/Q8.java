package lecture_question;

//  Swapping and reverse values in an array.

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        reverseValue(arr);
        System.out.println("Reversed Array -> " + Arrays.toString(arr));

        swapValue(arr, 3, 5);
        System.out.println("Swaped Values of Array -> " + Arrays.toString(arr));
    }

    public static void reverseValue(int[] arr){
        if (arr == null){
            System.out.println("The array is null !!!");
            return;
        }
        int endStart = arr.length - 1;

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[endStart];
            arr[endStart] = temp;
            endStart--;
        }
    }

    public static void swapValue(int[] arr, int index1, int index2){

        if (arr == null){
            System.out.println("The array is null !!!");
            return;
        }

        if (index1 <= arr.length - 1 && index2 <= arr.length - 1
            && index1 >= 0 && index2 >= 0 ){

            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;

        } else {
            System.out.println("ArrayIndexOutofBound !!!");
        }

    }
}
