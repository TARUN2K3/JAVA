package Conditional_statements;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int year = sc.nextInt();

        if(year%4 == 0){
            if(year%100 == 0){
                if(year%400 == 0){
                    System.out.println("Year is a Leap Year");
                }
                else{
                    System.out.println("year is Not Leap Year");
                }
            }else{
                System.out.println("year is Leap Year");
            }
        }
        else{
            System.out.println("year is Not Leap Year");
        }
    }
}
