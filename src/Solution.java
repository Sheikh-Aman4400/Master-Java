class Solution {
    static void main(String[] args) {
        int[][] arr = {
                {1, 1, 0},
                {1, 0, 0},
                {0, 1, 1}
        };

        flipAndInvertImage(arr);
    }
    public static int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++){
            swap (image[i]);
            xor (image[i]);
        }

        return image;
    }

    private static void swap (int[] row){

        int left = 0;
        int right = row.length - 1;

        while (left < right){

            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;

            left++;
            right--;
        }
    }

    private static void xor (int[] row){

        for (int i = 0; i < row.length; i++){
            row[i] = (row[i] ^ 1);

        }
    }
}