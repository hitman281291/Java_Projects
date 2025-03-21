package ex_09_switch_case;

public class Lab089_int_ques_2
{
    public static void main(String[] args)
    {
        char ch = 'A';
        switch(ch)
        {
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No match");
        }
    }
}
