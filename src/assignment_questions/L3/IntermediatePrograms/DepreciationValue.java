package assignment_questions.L3.IntermediatePrograms;

import java.util.Scanner;

public class DepreciationValue {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("To calculate depreciation value of the asset we need some information about it.");

        System.out.print("Original Cost : ");
        double org = input.nextDouble();
        //  The Salvage Value is the estimated value of an asset after it has completed its useful life.
        System.out.print("Salvage Value : ");
        double sal = input.nextDouble();
        //  Useful Life is the estimated number of years an asset can be used effectively.
        System.out.print("Useful Life : ");
        double use = input.nextDouble();

        double depValue = (org - sal) / use ;
        System.out.println("Depreciation Value : " + depValue);
    }
}
