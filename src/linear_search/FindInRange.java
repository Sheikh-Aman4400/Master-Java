package linear_search;

public class FindInRange {
    public static void main(String[] args) {

        int[] num = {1, 3, 5, 2, 6, 7, 8, 9, 10};
        int result = linearSearchInRange(num, 6, 1, 7);
        System.out.println("RESULT : " + result);
    }

    public static int linearSearchInRange(int[] array, int target, int start, int end){

        if (array == null || array.length == 0){
            System.out.println("[Array is null.]");
            return -1;
        }

            if (start < 0 || end >= array.length || start > end){
                System.out.println("[Start and End values are invalid.]");
                return -1;
            }

                for (int i = start; i <= end; i++){
                    if (array[i] == target){
                        return i;
                    }
                }

        System.out.println("[ Target not found !!! ]");
        return -1;
    }
}
