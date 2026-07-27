package assignment_questions.L3.IntermediatePrograms;

//  Calculate Discount Of Product

import java.util.Scanner;

public class DiscountOfProduct {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter the amount of Product : ");
        int productPrice = input.nextInt();

            if (productPrice <= 500){
                System.out.println("You got 5% discount : $" + ((productPrice * 5) / 100 ));
                System.out.println("Amount to be paid : $" + (productPrice - ((productPrice * 5) / 100 )));
            } else if (productPrice <= 1000) {
                System.out.println("You got 10% discount : $" + ((productPrice * 10) / 100 ));
                System.out.println("Amount to be paid : $" + (productPrice - ((productPrice * 10) / 100 )));
            } else if (productPrice <= 1500) {
                System.out.println("You got 15% discount : $" + ((productPrice * 15) / 100 ));
                System.out.println("Amount to be paid : $" + (productPrice - ((productPrice * 15) / 100 )));
            } else if (productPrice <= 2000) {
                System.out.println("You got 20% discount : $" + ((productPrice * 20) / 100 ));
                System.out.println("Amount to be paid : $" + (productPrice - ((productPrice * 20) / 100 )));
            } else {
                System.out.println("You got 50% discount : $" + ((productPrice * 50) / 100 ));
                System.out.println("Amount to be paid : $" + (productPrice - ((productPrice * 50) / 100 )));
            }

    }
}
