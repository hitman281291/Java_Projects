package Tasks.AdditionalPrograms;

import java.util.Scanner;

public class CharacterIsAlphabet
{
    public static void main(String[] args)
    {
        System.out.println("Enter a character : ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
        {
            System.out.println("Character is an alphabet");
        }
        else
        {
            System.out.println("Character is not an alphabet");
        }
    }
}
