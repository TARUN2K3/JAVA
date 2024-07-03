package Loops;

import java.util.Scanner;
import java.lang.*;

public class GP_Series {
    // a + ar + ar^2 + ar^3 +.....
    // 2, 6, 18 ,54....Common ratio
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Starting Number : ");
        int n = sc.nextInt();
        System.out.println("Enter the Ratio You want : ");
        int r = sc.nextInt();
        System.out.println("Enter the How many Term you want : ");
        int t = sc.nextInt();

        int  i = 0;
        int first_no = n;
        System.out.print(first_no+" ");
        while (i<t-1) {
            int second_no = first_no*r;
            System.out.print(" "+second_no);
            first_no = second_no;
            i++;
        }
    }
}
