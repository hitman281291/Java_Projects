package ex_07_Inc_and_Dec_operators;

public class Lab069_In_de_op {
    public static void main(String[] args) {

        String age_string = args[0];
        String a1 = args[1];
        String a2 = args[2];
        String a3 = args[3];
        String a4 = args[4]; // java.lang.ArrayIndexOutOfBoundsException
        int age = Integer.parseInt(age_string);
        System.out.println(age);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}


/* Output -
"C:\Program Files\Java\jdk-23\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.4.1\lib\idea_rt.jar=52575" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\COURSES\SDET\PROJECTS\out\production\PROJECTS ex_07_Inc_and_Dec_operators.Lab069_In_de_op 25 15 45 87 95
25
15
45
87
 */