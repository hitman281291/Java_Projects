package Tasks;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Task015_Even_Odd_Arrays {
    // Odd and Even Numbers from an Array

    public static void main(String[] args)
    {   System.out.println("Program to find even & odd numbers from an Array");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int num[] = new int[n];

        int even[] = new int[n];
        int odd[] = new int[n];

        for (int i=0; i<n; i++)
        {
            System.out.println("Enter the numbers");
            num[i] = sc.nextInt();
        }

        System.out.println("Even numbers :");
        {
            for (int i = 0; i < n; i++)
            {
                if (num[i] % 2 == 0)
                {
                    System.out.println(num[i]);
                }
            }
        }

        System.out.println("Odd numbers :");
        {
            for (int i = 0; i < n; i++)
            {
                if (num[i] % 2 != 0)
                {
                    System.out.println(num[i]);
                }
            }
        }
    }
}