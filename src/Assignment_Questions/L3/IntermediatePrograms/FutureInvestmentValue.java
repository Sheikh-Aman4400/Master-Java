package Assignment_Questions.L3.IntermediatePrograms;

import java.util.Scanner;

public class FutureInvestmentValue {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter details to calculate future investment value.");

        System.out.print("Present Value : ");
        double pv = in.nextDouble();
        System.out.print("Annual Interest : ");
        double rate = in.nextDouble();
        System.out.print("Time : ");
        double time = in.nextDouble();

        double fiv = pv * Math.pow( (1 + rate / 100) , time);
        System.out.printf("The value of your Future Investment : %.2f" , fiv);
    }
}
