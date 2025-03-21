package ex_09_switch_case;

import java.util.Scanner;

public class Lab086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of the week");
        int day1 = sc.nextInt();

        //int day = Integer.parseInt(args[0]);

        switch (day1) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
        }
    }
}
