package linear_search;

public class FindMinNum {
    public static void main(String[] args) {

        int[] num = {22, 54, 78, 33, 85, 46, 354, 35, 87};
        int[][] matrix = {
                {12, 35, 67},
                {67, 98, 989},
                {23, 54, 10}
        };

        int result = linearSearchMinNum(num);
        System.out.println("The Minimum Value : " + result);

        int ans = linearSearchMinNum2D(matrix);
        System.out.println("The Minimum Value : " + ans);
    }

    public static int linearSearchMinNum(int[] array){
        int minValue = Integer.MAX_VALUE;

        if (array == null || array.length == 0){
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        for (int elements : array){
            if (elements < minValue){
                minValue = elements;
            }
        }

        return minValue;
    }

    public static int linearSearchMinNum2D(int[][] array) {

        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        int minValue = Integer.MAX_VALUE;

        for (int row = 0; row < array.length; row++) {

            if (array[row] == null || array[row].length == 0) {
                throw new IllegalArgumentException("Rows must not be null or empty.");
            }

                for (int col = 0; col < array[row].length; col++) {

                    if (array[row][col] < minValue) {
                        minValue = array[row][col];
                    }
                }
        }
        return minValue;
    }
}

