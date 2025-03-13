package ex_06_Ternary_Operator;

public class Lab068_real_Age_Classification {
    public static void main(String[] args) {
        // age = 23 -> Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)
        // take an input from user
        System.out.println("Please enter your age");
        String age1 = args[0];

        System.out.println(age1);

        System.out.println(age1 instanceof String);

        int age = Integer.parseInt(age1);

        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior";
        System.out.println(result);
    }
}