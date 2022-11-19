package Alternative_Approach_Assignment1;

import java.util.Scanner;

class Main {

    public static void main(String args[]) {

        int arr[] = {
                31,
                28,
                31,
                30,
                31,
                30,
                31,
                31,
                30,
                31,
                30,
                31
        };
        Scanner sc = new Scanner(System. in );
        int month = sc.nextInt();
        int year = sc.nextInt();

        if (((month == 2) && (year % 4 == 0)) || ((year % 100 == 0) && (year % 400 == 0))) {
            System.out.println("Number of days is " + (arr[month - 1] + 1));
        }

        else System.out.println("Number of days is " + arr[month - 1]);

    }
}
