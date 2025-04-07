package Tasks.AdditionalProgram_series2;

import java.util.Objects;
import java.util.Scanner;

public class CheckWebsiteDomain
{
    public static void main(String[] args)
    {
        System.out.println("Enter the website domain : ");
        Scanner sc = new Scanner(System.in);
        String domain = sc.next();

        if (Objects.equals(domain, ".com"))
        {
            System.out.println("Commercial website");
        }
        else if (Objects.equals(domain, ".org"))
        {
            System.out.println("Non Profit website");
        }
        else if (Objects.equals(domain, ".edu"))
        {
            System.out.println("Educational website");
        }
        else if (Objects.equals(domain, ".gov"))
        {
            System.out.println("Government website");
        }
        else if (Objects.equals(domain, ".net"))
        {
            System.out.println("Network website");
        }
        else if (Objects.equals(domain, ".info"))
        {
            System.out.println("Information website");
        }
        else if (Objects.equals(domain, ".xyz"))
        {
            System.out.println("Unknown or other types of website");
        }
    }
}
