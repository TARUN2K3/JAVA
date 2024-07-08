package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Multiplication_Two_2D_Arrays {
    public static void main(String[] args) {
        System.out.println("Note ,this Program will work only Same Row and Column Only !!");
        System.out.println("Enter the No. of Rows : ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Enter the No. of Columns : ");
        int c = sc.nextInt();

        int arr1[][] = new int[r][c];
        int arr2[][] = new int[r][c];
        for(int i= 0; i<r;i++){
            for(int j = 0; j<c; j++){
                System.out.println("Enter the Element for Array 1 : ");
                int e1 = sc.nextInt();
                arr1[i][j]=e1;
            }
        }
        for(int i= 0; i<r;i++){
            for(int j = 0; j<c; j++){
                System.out.println("Enter the Element for Array 2 : ");
                int e2 = sc.nextInt();
                arr2[i][j]=e2;
            }
        }
        System.out.println("Array 1");
        for(int i= 0; i<r;i++){
            for(int j = 0; j<c; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.err.println("");
        }
        System.out.println("Array 2");
        for(int i= 0; i<r;i++){
            for(int j = 0; j<c; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.err.println("");
        }
        System.out.println("Multiplication of Array ");
        int mul[][] = new int[r][c];
        for(int i= 0; i<r;i++){
            for(int j = 0; j<c; j++){
                mul[i][j]=arr1[i][j]*arr2[i][j];
            }
        }
        for(int i= 0; i<r;i++){
            for(int j = 0; j<c; j++){
                System.out.print(mul[i][j]+" ");
            }
            System.err.println("");
        }
    }
}
