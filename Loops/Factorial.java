package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int i = 1;
        int num = 1;
        while (i <= n) {
            num = num * i;
            i++;
        }
        System.out.println("Factorial of " + n + " is: " + num);
    }
}
