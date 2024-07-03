package Loops;

import java.util.Scanner;

public class Display_No_in_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        int reverse =0;
        int  i=0;
        while (i<n) {
            int last_digit = n%10;
            reverse = reverse*10+last_digit;
            n=n/10;
        }
        int reverse_last_digit = reverse%10;
        reverse = n/10;
            switch (reverse_last_digit) {
                case 1:System.out.println("One");
                    
                    break;
                case 2:System.out.println("Two");
                    
                    break;
                case 3:System.out.println("Three");
                    
                    break;
                case 4:System.out.println("Four");
                    
                    break;
                case 5:System.out.println("Five");
                    
                    break;
                case 6:System.out.println("six");
                    
                    break;
                case 7:System.out.println("Seven");
                    
                    break;
                case 8:System.out.println("Eight");
                    
                    break;
                case 9:System.out.println("Nine");
                    
                    break;
                case 10:System.out.println("Ten");
                    
                    break;
            
                default:
                    break;
            }
        System.out.println();
    }
}
