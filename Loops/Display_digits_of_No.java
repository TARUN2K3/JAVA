package Loops;

import java.util.Scanner;

public class Display_digits_of_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. : ");
        int n = sc.nextInt();

        int reverse = 0;
        int i = 0;
        while(i<n){
            int last_digit = n%10;
            reverse = reverse*10+last_digit;
            n = n/10;
        }
        int reverse_again = 0;
        int x = 0;
        while (x<reverse) {
            int last_digit_reverse = reverse%10;
            reverse_again = reverse_again*10+last_digit_reverse;
            switch (last_digit_reverse) {
                case 0:System.out.print("Zero");
                    break;
                case 1:System.out.print("One");
                    break;
                case 2:System.out.print("Two");
                    break;
                case 3:System.out.print("Three");
                    break;
                case 4:System.out.print("Four");
                    break;
                case 5:System.out.print("Five");
                    break;
                case 6:System.out.print("Six");
                    break;
                case 7:System.out.print("Seven");
                    break;
                case 8:System.out.print("Eight");
                    break;
                case 9:System.out.print("Nine");
                    break;
                default:
                    break;
            }
            reverse = reverse / 10;
        }
    }
}
