package Tasks.AdditionalProgram_series2;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Days_Years_conversion
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number of days : ");
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();

        int years = days / 365;
        int balanceDays = days % 365;

        int months = balanceDays / 30;
        balanceDays = balanceDays % 30;

        System.out.println(years + " years, " + months + " months, and " + balanceDays + " days.");

    }
}
