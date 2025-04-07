package Tasks.AdditionalProgram_series2;

import java.util.Scanner;

public class AgeCategoryLogic
{
    public static void main(String[] args)
    {
        System.out.println("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 0 && age <= 12)
        {
            System.out.println("Child");
        }
        else if (age >= 13 && age <= 19)
        {
            System.out.println("Teenager");
        }
        else if (age >= 20 && age <= 64)
        {
            System.out.println("Adult");
        }
        else
        {
            System.out.println("Senior Citizen");
        }
    }
}
