package Loops;
import java.util.*;

public class AP_Series {
    // 5, 10, 15, 20, 25....
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Starting Number : ");
        int n = sc.nextInt();
        System.out.println("Enter the Difference You want : ");
        int d = sc.nextInt();
        System.out.println("Enter the How many Term you want : ");
        int t = sc.nextInt();

        int i = 0;
        int first_no = n;
        System.out.print(first_no+" ");
        while(i<t-1){
            int second_no = first_no + n;
            System.out.print(second_no+" ");
            first_no = second_no;
            i++;
        }
    }
}
