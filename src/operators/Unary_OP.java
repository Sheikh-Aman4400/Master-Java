package operators;

/*

Unary Operators -> Operate on a single operand.

    Operators
         + Unary Plus
         - Unary Minus
         ++ Increment
         -- Decrement
         ! Logical NOT

 */

public class Unary_OP {
    static void main(String[] args) {
        int a = 10;

        System.out.println(++a); // 11
        System.out.println(--a); // 10
        System.out.println(!false); // true
    }
}
