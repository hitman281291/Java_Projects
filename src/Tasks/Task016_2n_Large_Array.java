package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task016_2n_Large_Array
{
    public static void main(String[] args)
    {
        System.out.println("Second Largest Number finder in an Array");

        System.out.println("***********************");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        int n = sc.nextInt();

        int num[] = new int[n];

        for (int i=0 ; i<num.length ; i++)
        {       System.out.println("Enter the number");
                num[i] = sc.nextInt();

        }
        System.out.println("You have entered these numbers : "+ Arrays.toString(num));

        int largest = num[0];

        System.out.println("Sorted numbers from smallest to largest : ");
        for(int i=0; i<num.length ; i++)
        {
                for (int j=i+1 ; j<num.length ; j++)
                {
                    int temp = 0;
                    if (num[i] > num[j])
                    {
                        temp = num[i];
                        num[i] = num[j];
                        num[j] = temp;
                    }
                }
            System.out.print(num[i]+" ");
        }

       System.out.println(" ");
       System.out.println("The second largest number is : "+ num[num.length-2]);

    }
}
