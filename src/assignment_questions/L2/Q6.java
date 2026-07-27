package assignment_questions.L2;

//  Q6 -> Input currency in rupees and output in USD.

import java.util.Scanner;

public class Q6 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter the amount in rupees to convert into USD.");

        System.out.print("Rupee Amount : ");
            double rupee = input.nextDouble();

        System.out.printf("USD Amount : %.2f", (rupee / 86));
    }
}
