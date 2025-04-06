package ex_21_OOPs_Encapsulation.Task;

import java.util.Scanner;

public class ATB {
    public static void main(String[] args) {
        System.out.println("Enter the number of students in ATB : ");
        Scanner sc = new Scanner(System.in);
        int[] ATB_Students = new int[sc.nextInt()];

        System.out.println("Total students in ATB Class : " + ATB_Students.length);

        Student s1 = new Student("Hitesh", 1);
        Student s2 = new Student("Rahul", 2);

        Notes n = new Notes();

        Membership m = new Membership();

        Riya r = new Riya();
        Sandeep s = new Sandeep();

        System.out.println(s1);
        s1.notes();
        s1.notes("Java");

        System.out.println(s2);
        s2.notes();
        s2.notes("Java");

        r.notes();
        r.notes("Java");

        s.notes();
        s.notes("Java");

        m.membership();

    }
}


