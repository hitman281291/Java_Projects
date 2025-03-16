package ex_08_If_Condition;

import java.util.Scanner;

public class Practice_even_odd
{
    public static void main(String[] args)
    {
        System.out.println("Program to find even or odd values");

        System.out.println("Enter the number : ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2==0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }

    }
}
