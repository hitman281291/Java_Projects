package ex_09_switch_case;

public class Lab94_JDK13
{
    public static void main(String[] args)
    {
        int itemcode = 006;

        switch (itemcode)
        {
            case 001, 002, 005:
                System.out.println("All of them are electronic gadgets");
                break;

            case 004, 006, 007:
                System.out.println("This is match");
                break;

            default :
                System.out.println("None");


        }
    }
}
