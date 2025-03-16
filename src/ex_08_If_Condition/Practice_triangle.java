/*Write a program that classifies a triangle based on its side lengths. Given three input values
representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal),
isosceles (exactly two sides are equal), or scalene (no sides are equal). Use an if-else statement to classify the triangle.*/

package ex_08_If_Condition;
import java.util.Scanner;

public class Practice_triangle
{
    public static void main(String[] args)
    {
        System.out.println("Program to find triangle type");

        System.out.println("Enter the first side : ");

        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        System.out.println("Enter the second side : ");

        Scanner sc1 = new Scanner(System.in);
        int side2 = sc.nextInt();
        System.out.println("Enter the third side : ");

        Scanner sc2 = new Scanner(System.in);
        int side3 = sc.nextInt();

        if (side1 == side2 && side2 == side3)
        {
            System.out.println("Triangle is Equilateral");
        }
        else if (side1 == side2 || side2 == side3 || side1 == side3)
        {
            System.out.println("Triangle is Isosceles");
        }
        else
        {
            System.out.println("Triangle is Scalene");
        }
    }
}
