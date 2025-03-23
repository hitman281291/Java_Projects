package ex_11_While_loop;

import java.util.Scanner;

public class Task_fibonacci
{
    public static void main(String[] args) {

        System.out.println("Program to print fibonacci series");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a count for which fibonacci series in needed");

        int num = sc.nextInt();

        int x =0, y=1;

        System.out.println("Fibonacci series for "+num+" counts is :");

        for (int i=0; i<num; i++)
        {
            System.out.print(x+" ");

            int temp = x;
            x = y;
            y = temp + y;
        }

    }
}
