package Assignment_Questions.L3.IntermediatePrograms;

//  Calculate Commission Percentage

import java.util.Scanner;

public class CommissionPercentage {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the total sales amount: : ");
        double saleAmount = input.nextDouble();

        if (saleAmount <= 500){
            System.out.println("You got 1% Commission : $" + ((saleAmount * 1) / 100 ));
        } else if (saleAmount <= 1000) {
            System.out.println("You got 2% Commission : 2$" + ((saleAmount * 2) / 100 ));
        } else if (saleAmount <= 1500) {
            System.out.println("You got 3% Commission : $" + ((saleAmount * 3) / 100 ));
        } else if (saleAmount <= 2000) {
            System.out.println("You got 4% Commission : $" + ((saleAmount * 4) / 100 ));
        } else {
            System.out.println("You got 10% Commission : $" + ((saleAmount * 10) / 100 ));
        }
    }
}
