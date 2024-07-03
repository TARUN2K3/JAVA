package Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int on = sc.nextInt();
        int n = on;

        int reverse = 0;

        while (n > 0) {
            int last_digit = n % 10;
            reverse = reverse * 10 + last_digit;
            n = n / 10;
        }

        if (reverse == on) {
            System.out.println("Number is palindrome");
        } else {
            System.err.println("Number is not palindrome");
        }
    }
}
