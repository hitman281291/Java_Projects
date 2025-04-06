package Tasks.AdditionalPrograms;

import java.util.Scanner;

public class ATM_Withdrawal
{
    public static void main(String[] args)
    {
        int Balance = 10000;
        System.out.println("Enter the amount to withdraw : ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        if (amount > Balance)
        {
            System.out.println("Insufficient balance");
        }
        else if (amount > 0 && amount%100 == 0)
        {
            Balance = Balance - amount;
            System.out.println("Remaining balance : " + Balance);
        }
        else
        {
            System.out.println("Enter the amount in multiples of 100");
        }
    }
}
