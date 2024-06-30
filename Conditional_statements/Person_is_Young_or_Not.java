package Conditional_statements;

import java.util.Scanner;

public class Person_is_Young_or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter Person Age :");
         int age = sc.nextInt();

         if(age >= 18 && age <= 55){
            System.out.println("Person is Young");
         }
         else{
            System.out.println("Person is Not Young");
         }
    }
}
