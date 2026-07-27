package linear_search;

public class FindTarget {
    public static void main(String[] args) {

        int[] num = {1, 3, 5, 2, 6, 7, 8, 9, 10};
        boolean result = linearSearch(num, 11);
        System.out.println("RESULT : " + result);

    }

    public static boolean linearSearch(int[] array, int target){

        if (array == null || array.length == 0){
            System.out.println("[ Array is null !!! ]");
            return false;
        }
            for (int elements : array){
                if (elements == target){
                    return true;
                }
            }
        System.out.println("[ Target not found !!! ]");
        return false;
    }
}
