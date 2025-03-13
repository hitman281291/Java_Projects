package ex_06_Ternary_Operator;

public class TO_Assignment {

    public static void main(String[] args) {

        System.out.println("Enter your marks");

        String marks1 = args[0];
        int marks = Integer.parseInt(marks1);

        System.out.println("You've entered "+marks);

        String grade = (marks >= 90) ? "A" : (marks >= 80) ? "B" : (marks >= 70) ? "C" : (marks >= 60) ? "D" : "F";

        System.out.println("Your grade is "+grade);

    }
}
