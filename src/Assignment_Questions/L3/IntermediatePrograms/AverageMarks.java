package Assignment_Questions.L3.IntermediatePrograms;

import java.util.Scanner;

public class AverageMarks {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter all subject marks.");

        System.out.print("JAVA : ");
        float java = input.nextFloat();
        System.out.print("PYTHON : ");
        float python = input.nextFloat();
        System.out.print("DBMS : ");
        float dbms = input.nextFloat();
        System.out.print("CLOUD COMPUTING : ");
        float cloud = input.nextFloat();
        System.out.print("INFORMATION SECURITY : ");
        float it = input.nextFloat();

        System.out.println("AVERAGE MARKS -> " + (java + python + dbms + cloud + it) / 5 );
    }
}
