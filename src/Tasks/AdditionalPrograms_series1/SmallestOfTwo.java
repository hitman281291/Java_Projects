package Tasks.AdditionalPrograms_series1;

import java.util.Scanner;

public class SmallestOfTwo
{
    public static void main(String[] args) {
        System.out.println("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) {
            System.out.println("Smallest number is : " + a);
        } else {
            System.out.println("Smallest number is : " + b);
        }
    }
}
