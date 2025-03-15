package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_if_Else
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18)
        {
            System.out.println("Allowed to vote");
        }
        else
        {
            System.out.println("Not allow");
        }
    }
}
