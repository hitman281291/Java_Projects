//Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.

package ex_07_Inc_and_Dec_operators;

public class Practice_ter_operator
{
    public static void main(String[] args)
    {
      String a = args[0];
      String b = args[1];

      int a_int = Integer.parseInt(a);
      int b_int = Integer.parseInt(b);

      int result = a_int > b_int ? a_int : b_int;

      System.out.println(result);
    }
}
