package assignment_questions.L3.IntermediatePrograms;

import java.util.Scanner;

public class FindNcrNpr {
     static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter details to find Npr.");

        System.out.print("Value of n -> ");
        int n = in.nextInt();
        int nFact = factorial(n);

        System.out.print("Value of r -> ");
        int r = in.nextInt();
        int rFact = factorial((r));

        int nrFact = factorial(n - r);
        int ncr = nFact / ( nrFact * rFact );
        int npr = nFact / nrFact;
        System.out.println("nPr : " + npr);
        System.out.print("nCr : " + ncr);

     }

    static int factorial (int num){
        int fact = 1;
            while (num != 0){
                fact *= num;
                num--;
            }
        return fact;
    }
}
