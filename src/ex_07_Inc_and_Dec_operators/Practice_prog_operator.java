//Take a user input - Name, Age and Salary and print them in the end.

package ex_07_Inc_and_Dec_operators;

public class Practice_prog_operator
{
    public static void main(String[] args) {

        //Accepts three inputs from user on the CLI
        String name = args[0];
        String age = args[1];
        String Salary = args[2];

        //Parses the integer values from the strings
        int age_int = Integer.parseInt(age);
        int age_salary = Integer.parseInt(Salary);

        //Prints the values
        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);
        System.out.println("salary is : "+Salary);

    }
}
