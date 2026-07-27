package conditional_statements;


    /*
    Conditional Statements in Java
        Conditional statements allow a program to make decisions based on conditions.
        They execute different blocks of code depending on whether a condition is true or false.

    Types of Conditional Statements in Java

        1. if statement
        2. if-else statement
        3. if-else-if ladder
        4. Nested if
        5. switch statement
        6. Ternary Operator (?:)

     */
    public class statements {
         static void main(String[] args) {

            // =========================
            // 1. if Statement
            // =========================
            System.out.println("1. IF Statement");

            int age = 20;

            if (age >= 18) {
                System.out.println("You are eligible to vote.");
            }

            // =========================
            // 2. if-else Statement
            // =========================
            System.out.println("\n2. IF-ELSE Statement");

            int number = 15;

            if (number % 2 == 0) {
                System.out.println(number + " is Even.");
            } else {
                System.out.println(number + " is Odd.");
            }

            // =========================
            // 3. if-else-if Ladder
            // =========================
            System.out.println("\n3. IF-ELSE-IF Ladder");

            int marks = 82;

            if (marks >= 90) {
                System.out.println("Grade A");
            } else if (marks >= 80) {
                System.out.println("Grade B");
            } else if (marks >= 70) {
                System.out.println("Grade C");
            } else if (marks >= 60) {
                System.out.println("Grade D");
            } else {
                System.out.println("Fail");
            }

            // =========================
            // 4. Nested if
            // =========================
            System.out.println("\n4. Nested IF");

            boolean hasLicense = true;

            if (age >= 18) {
                if (hasLicense) {
                    System.out.println("You can drive.");
                } else {
                    System.out.println("Get a driving license first.");
                }
            } else {
                System.out.println("You are under 18.");
            }

            // =========================
            // 5. switch Statement
            // =========================
            System.out.println("\n5. SWITCH Statement");

            int day = 3;

            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid Day");
            }

            // =========================
            // 6. Ternary Operator
            // =========================
            System.out.println("\n6. Ternary Operator");

            String result = (age >= 18) ? "Adult" : "Minor";
            System.out.println(result);
        }
    }


