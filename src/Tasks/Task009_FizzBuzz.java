package Tasks;

public class Task009_FizzBuzz
{
    public static void main(String[] args)
    {

        System.out.println("## Fizz Buzz Program to print number from 1 to 100 ##");

        for(int i=1; i<=100; i++)
        {
            if (i%3==0)
            {
                System.out.println(i+" = FIZZ");
            }
            else if(i%5==0)
            {
                System.out.println(i+" = BUZZ");
            }
            else if ((i%3==0) && (i%5==0))
            {
                System.out.println(i+" = FizzBuzz");
            }
        }

    }
}
