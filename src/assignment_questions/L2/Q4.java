package assignment_questions.L2;

//  Q4 -> Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Q4 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a basic calculator program.");

        System.out.print("Enter number 01 : ");
            double num1 = input.nextDouble();
        System.out.print("Enter number 02 : ");
            double num2 = input.nextDouble();
        System.out.println("Please select operator [ + , - , * , / ]");
            char op = input.next().charAt(0);


        if (op == '*') {
            System.out.println("Multiplication : " + (num1 * num2));
        }
        else if (op == '/'){
            if (num2 == 0){
                System.out.println("Zero is not allowed for division.");
            }else{
                System.out.println("Divide : " + (num1 / num2));
            }
        }
        else if (op == '+'){
            System.out.println("Addition : " + (num1 + num2));
        }
        else if (op == '-'){
            System.out.println("Subtraction : " + (num1 - num2));
        }else {
            System.out.println("Wrong input , Try again");        }
    }
}
