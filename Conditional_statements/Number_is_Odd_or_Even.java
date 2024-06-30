package Conditional_statements;

import java.util.Scanner;

public class Number_is_Odd_or_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number :");
        int num = sc.nextInt();

        if(num%2==0)
        {
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}
