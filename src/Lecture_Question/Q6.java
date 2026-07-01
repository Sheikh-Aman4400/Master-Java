package Lecture_Question;

// Q6 -> create a basic calculator program.

import java.util.Scanner;

public class Q6 {

     static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print("Enter number 01 (or x to exit): ");
            String num1 = input.nextLine();

            if (num1.equalsIgnoreCase("x")) {
                System.out.println("Calculator closed.");
                break;
            }

            System.out.print("Enter number 02: ");
            String num2 = input.nextLine();

            System.out.print("Select operator [*, /, +, -, %]: ");
            char op = input.next().charAt(0);
            input.nextLine();

            int n1 = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);

            switch (op) {
                case '*':
                    System.out.println(n1 * n2);
                    break;

                case '+':
                    System.out.println(n1 + n2);
                    break;

                case '-':
                    System.out.println(n1 - n2);
                    break;

                case '/':
                    if (n2 != 0)
                        System.out.println(n1 / n2);
                    else
                        System.out.println("Cannot divide by zero.");
                    break;

                case '%':
                    if (n2 != 0)
                        System.out.println(n1 % n2);
                    else
                        System.out.println("Cannot divide by zero.");
                    break;

                default:
                    System.out.println("Invalid operator.");
            }
        }

        input.close();
    }
}