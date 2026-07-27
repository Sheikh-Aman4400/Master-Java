package binary_search;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                { 1,  4,  7, 11},
                { 2,  5,  8, 12},
                { 3,  6,  9, 16},
                {10, 13, 14, 17}
        };

        int target = 9;
        System.out.println(Arrays.toString(searchSortedBS(matrix, target)));
    }

    public static int[] searchSortedBS (int[][] matrix, int target){
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }

            if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }

        return new int[]{-1, -1};
    }
}
