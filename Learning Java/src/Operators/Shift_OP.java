package Operators;

/*

Operator Precedence (Highest to Lowest)

    1. () Parentheses
    2. Unary (++, --, !)
    3. *, /, %
    4. +, -
    5. Relational (<, >, <=, >=)
    6. Equality (==, !=)
    7. Logical AND (&&)
    8. Logical OR (||)
    9. Ternary (?:)
    10. Assignment (=, +=, -=, etc.)

 */


/*

Shift Operators -> Used to shift bits left or right.

    Operators
         << Left Shift
         >> Right Shift
         >>> Unsigned Right Shift

 */
public class Shift_OP {
    static void main(String[] args) {

        int a = 8;

        System.out.println(a << 1);
        System.out.println(a >> 1);
    }
}
