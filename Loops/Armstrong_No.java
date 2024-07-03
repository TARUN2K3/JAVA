package Loops;

import java.util.Scanner;

/**
 * Armstrong_No
 */
public class Armstrong_No {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int on = sc.nextInt();
        int n = on;
        String str = Integer.toString(n);
        int len = str.length();

        int arm_no = 0; 
        while (n > 0) {
            int last_digit = n % 10;
            arm_no += Math.pow(last_digit, len);
            n = n / 10;
        }

        if (arm_no == on) {
            System.out.println("Number is an Armstrong number");
        } else {
            System.out.println("Number is not an Armstrong number");
        }
    }
}
