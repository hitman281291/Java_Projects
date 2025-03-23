package Tasks;

import java.util.Locale;
import java.util.Scanner;

public class Task011_Palindrome
{
    public static void main(String[] args)
    {
        System.out.println("Enter a string to check if it's a palindrome");

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        int length=word.length();
        String rev = "";

        for (int i=(length-1);i>=0; --i)
        {
            rev = rev + word.charAt(i);

        }
        if (word.toLowerCase().equals(rev.toLowerCase()))
        {
            System.out.println(word + " is a palindrom string");
        }
        else
        {
            System.out.println(word + " is not a palindrom string");
        }
    }
}
