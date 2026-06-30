package Lecture_Question;
import java.util.Scanner;

//  Input a number and print whether it is prime or not.



// Solution - Basic
public class Q1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number to check whether it is prime or not.");
        int num = sc.nextInt();

        if (num <= 1){
            System.out.println("neither prime nor composite");
        }else {
            boolean isPrime = false;
                for (int i = 2; i < num; i++) {
                    if (num % i == 0){
                        isPrime = true;
                        break;
                    }
                }

                if (isPrime == true){
                    System.out.println("It's not a Prime number.");
                }else{
                    System.out.println("It's a Prime number.");
                }
        }

    }
}




// Solution - Advanced which reduce time complexity.

class Q1_1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number to check whether it is prime or not.");
        int num = sc.nextInt();

        if (num <= 1){
            System.out.println("neither prime nor composite");
        }else {
            boolean isPrime = false;
                for (int i = 2; i < num; i++) {
                    if (num % i == 0){
                        isPrime = true;
                        break;
                    }
                }

                if (isPrime == true){
                    System.out.println("It's not a Prime number.");
                }else{
                    System.out.println("It's a Prime number.");
                }
        }

    }
}