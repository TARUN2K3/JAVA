package Conditional_statements;

import java.util.Scanner;

public class Find_No_is_Radix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number");
        String str = sc.next();
        Boolean binary = str.matches("[10]+");
        Boolean Octal  = str.matches("[0-7]+");
        Boolean Hexa = str.matches("[0-9a-zA-Z]+");
        Boolean Decimal = str.matches("[0-9]+");

        if(binary){
            System.out.println("Given No. is Binary Form");
        }
        else if(Octal){
            System.out.println("Given No. is Octal Form");
        }
        else if(Decimal){
            System.out.println("Given No. is Decimal Form");
        }
        else if(Hexa){
            System.out.println("Given No. is Hexadecimal Form");
        }
        
        else{
            System.out.println("No. is Invalid");
        }
    }
}
