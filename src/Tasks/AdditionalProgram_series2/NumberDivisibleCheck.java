package Tasks.AdditionalProgram_series2;

import java.util.Scanner;

public class NumberDivisibleCheck
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 5 == 0 && num % 11 == 0)
        {
            System.out.println("Number is divisible by 5 and 11");

        }
        else
        {
            System.out.println("Number is not divisible by 5 & 11");
        }
    }
}
