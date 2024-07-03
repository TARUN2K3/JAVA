package Loops;
import java.lang.*;
import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n = sc.nextInt();

        for(int i=0; i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}
