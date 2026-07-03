package Assignment_Questions.L3.IntermediatePrograms;

import java.util.Scanner;

public class BattingAverage {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter total runs : ");
        int runs = input.nextInt();
        System.out.print("Please, enter times out : ");
        int outs = input.nextInt();

        System.out.println("Batting Average -> " + (runs / outs));
    }
}
