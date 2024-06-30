package Conditional_statements;

import java.util.Scanner;

public class Menu_driven_Program {
    public static void main(String[] args) {
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int x = sc.nextInt();
        System.out.println("Enter Second Number");
        int y = sc.nextInt();
        System.out.println("Enter Option Name");
        String option = sc.next();
        option = option.toUpperCase();

        switch (option) {
            case "ADD":System.out.println("ADD "+(x+y));
                
                break;
            case "SUB":System.out.println("ADD "+(x-y));
                
                break;
            case "MUL":System.out.println("ADD "+(x*y));
                
                break;
            case "DIV":System.out.println("ADD "+(x/y));
                
                break;
        
            default:
                break;
        }


        
    }
}
