package recursion;

public class Fibonacci {
    static void main(String[] args) {

        System.out.println(fiboo(4));
    }

    static int fiboo (int num){

        if (num < 2){
            return num;
        }

        return fiboo(num -1) + fiboo(num - 2);
    }
}
