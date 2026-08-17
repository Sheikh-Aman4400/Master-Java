package recursion;

public class Fibonacci {
    static void main(String[] args) {

        System.out.println(fiboo(5));

        for (int i = 0; i < 500; i++) {
            System.out.print(fiboFormula(i) + " ");
        }
    }

    static long fiboFormula (int num){
        // This is the solution from Recurrence Relation formula.
        return (long) ( Math.pow(  ((1 + Math.sqrt(5)) / 2)  , num)   / Math.sqrt(5) );
    }
    static int fiboo (int num){

        if (num < 2){
            return num;
        }

        return fiboo(num -1) + fiboo(num - 2);
    }
}
