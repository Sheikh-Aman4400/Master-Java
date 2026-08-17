package math_dsa;

import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = in.nextInt();
        in.close();

        getFactors (num);
    }

    private static void getFactors(int num) {

        Set<Integer> result = new TreeSet<>();
        for (int i = 1; i <= Math.sqrt(num); i++) {

            if (num % i == 0){
               result.add(i);
               result.add(num/i);
            }
        }

        for (int nums : result){
            System.out.print(nums + " ");
        }
    }
}
