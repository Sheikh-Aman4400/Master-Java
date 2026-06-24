package Operators;


/*

A shorthand form of if-else.

Syntax:-
    condition ? expression1 : expression2;

 */

public class Ternary_OP {
    static void main(String[] args) {

        int age = 20;

        String result = (age >= 18) ? "Adult" : "Minor";

        System.out.println(result);

    }
}
