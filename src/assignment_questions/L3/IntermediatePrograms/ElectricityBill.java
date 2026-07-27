package assignment_questions.L3.IntermediatePrograms;

import java.util.Scanner;

public class ElectricityBill {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter it's a domestic or commercial connections : ");
        String consumerType = input.nextLine();

        System.out.print("Please, Enter how many unit consumed by customer : ");
        double units = input.nextDouble();
        double unitCharge = 0;
        double fixedCharge = 0;

            if (units <= 30){
                unitCharge = units * 3.35;
            } else if (units >= 31 && units <= 100) {
                unitCharge = units * 4.80;
            } else if (units >= 101 && units <= 200) {
                unitCharge = units * 5.95;
            } else {
                unitCharge = units * 7.90;
            }

                if (consumerType.equalsIgnoreCase("domestic")){
                    fixedCharge = 200;
                }else {
                    fixedCharge = 500;
                }

        System.out.println("Consumed Unit Charge : " + unitCharge);
        System.out.println("Fixed Charge : " + fixedCharge);
        System.out.println("Total bill : " + (unitCharge + fixedCharge));


    }
}
