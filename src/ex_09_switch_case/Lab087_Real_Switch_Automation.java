package ex_09_switch_case;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {
        //String browser = args[0];
        //System.out.println(browser);

        System.out.println("Enter the brwoser name");
        Scanner scanner = new Scanner(System.in);
        String browser = scanner.next();

        switch (browser) {
            case "chrome":
                System.out.println("Chrome is selected");
                System.out.println("TC1..");
                System.out.println("TC2..");
                break;
            case "firefox":
                System.out.println("Firefox is selected");
                System.out.println("TC1..");
                System.out.println("TC2..");
                break;
            case "edge":
                System.out.println("Edge is selected");
                System.out.println("TC1..");
                System.out.println("TC2..");
                break;
            default:
                System.out.println("Invalid browser");
        }
    }
}
