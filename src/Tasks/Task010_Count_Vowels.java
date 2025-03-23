package Tasks;

import java.util.Scanner;

public class Task010_Count_Vowels
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word whose vowels and consonants are to be counted");
        String string = scanner.nextLine();

        String word = string.toLowerCase();

        int wordlength = word.length();

        int vowelcount = 0, consonantcount=0;

        String vowels = "aeiou";

        for (int i=0; i<wordlength ; i++)
        {
            char ch = word.charAt(i);
            if(Character.isLetter(ch))
            {
                if (vowels.indexOf(ch) != -1)
                {
                    vowelcount++;
                }
                else
                {
                    consonantcount++;
                }
            }
        }

        System.out.println("Number of vowels :"+vowelcount);
        System.out.println("Number of consonants :"+consonantcount);

    }
}
