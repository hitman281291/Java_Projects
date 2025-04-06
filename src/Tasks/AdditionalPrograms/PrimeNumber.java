package Tasks.AdditionalPrograms;

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        if(num ==0 || num == 1)
        {
            System.out.println(num + " is not a prime number");
        }
        else
        {
            for(int i=2; i<=num/2; i++)
            {
                if(num % i == 0)
                {
                    System.out.println(num + " is not a prime number");
                    count++;
                    break;
                }
            }
            if(count == 0)
            {
                System.out.println(num + " is a prime number");
            }
        }
    }
}
