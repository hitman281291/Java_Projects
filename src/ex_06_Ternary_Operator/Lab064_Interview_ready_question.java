package ex_06_Ternary_Operator;

public class Lab064_Interview_ready_question
{
    public static void main(String[] args)
    {
        //Nested ternary

        int num = 25;
        String result = (num >10) ? (num > 20 ? "num>20" : "num>20") : "B" ;

        System.out.println(result);
    }
}
