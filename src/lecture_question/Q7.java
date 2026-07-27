package lecture_question;
// Describe Fruits

import java.util.Scanner;

public class Q7 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, enter fruit name : ");
        String fruit = in.next().toLowerCase();

        switch (fruit) {

            case "mango" -> System.out.println("King of Fruits");
            case "apple" -> System.out.println("Keeps the doctor away");
            case "banana" -> System.out.println("Rich in potassium");
            case "orange" -> System.out.println("Rich in Vitamin C");
            case "grapes" -> System.out.println("Small and juicy fruit");
            case "watermelon" -> System.out.println("Best fruit for summer");
            case "pineapple" -> System.out.println("Tropical fruit with a spiky skin");
            case "papaya" -> System.out.println("Good for digestion");
            case "strawberry" -> System.out.println("Sweet and red berry");
            case "kiwi" -> System.out.println("Small fruit with green flesh");
            default -> System.out.println("Unknown fruit");

        }
    }
}
