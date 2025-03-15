package ex_04_operators;

public class Lab043_Interview_Concat_Plus
{
    public static void main(String[] args) {
        String first_name = "Hitesh";
        String last_name = "Purohit";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);
        // // HiteshPurohit1010 - first operator - + performed as Concatenation

        System.out.println(a + b + first_name + last_name);


        System.out.println(first_name + last_name + (a + b));

        // BODMAS - Bracket of Div, mul, add, sub
    }

}
