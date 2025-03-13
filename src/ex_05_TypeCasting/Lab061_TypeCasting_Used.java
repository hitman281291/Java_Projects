package ex_05_TypeCasting;

public class Lab061_TypeCasting_Used
{
    public static void main(String[] args) {

        int course = 100;
        float GST = 18.56f;

        //int total = course+GST;

        int total1 = course+(int)GST;

        //System.out.println(total);
        System.out.println(total1);

        float total2 = course+GST;
        float total3 = (float)course+GST;
        System.out.println(total2);
        System.out.println(total3);

    }
}
