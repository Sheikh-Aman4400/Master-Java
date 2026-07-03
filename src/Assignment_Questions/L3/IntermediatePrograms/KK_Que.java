package Assignment_Questions.L3.IntermediatePrograms;

/*

    Kunal is allowed to go out with his friends only on the even days of a given month.
    Write a program to count the number of days he can go out in the month of August.

 */

import java.util.Scanner;

public class KK_Que {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please, enter the month : ");
        String month = in.nextLine();

        int mdays = monthDays(month.toLowerCase());
        int days = isEven(mdays);
        System.out.printf("In %s you go out with friends only %d" , month , days);

    }

    static int monthDays (String month){

        if (month.equals("february")){
            return 28;
        }
        if (month.equals("january") || month.equals("march") || month.equals("may") || month.equals("july") || month.equals("august") || month.equals("october") || month.equals("december")){
            return 31;
        }else {
            return 30;
        }
    }

    static int isEven (int day){
        int count = 0;
        for (int i = 1; i <= day; i++) {
            if (i % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
