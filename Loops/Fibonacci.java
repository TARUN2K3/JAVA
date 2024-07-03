package Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        
        int first_no = 0;
        int second_no = 1;
        System.out.print(first_no+" "+second_no);
        int i = 0;
        while(i<n-2){
            int next_no = second_no + first_no;
            System.out.print(" "+next_no);
            first_no = second_no;
            second_no = next_no;
            i++;
        }
    }
}
