package Loops;

import java.util.Scanner;

public class Sum_of_N_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int i = 1; // start i from 1
        int sum = 0;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of first " + n + " numbers is: " + sum);
    }
}
