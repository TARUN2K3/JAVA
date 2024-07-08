package Array;

import java.util.Scanner;

public class Adding_Two_2D_Arrays {
    public static void main(String[] args) {
        System.out.println("Enter the No. of Rows : ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Enter the NO. of Columns : ");
        int c = sc.nextInt();

        int arr1[][] = new int[r][c];
        int arr2[][] = new int[r][c];
        System.out.println("Array ");
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.println("Enter the element for array 1 : ");
                int e1 = sc.nextInt();
                arr1[i][j]=e1;
            }
        }
        System.out.println("Array 2 ");
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.println("Enter the element for array 2 : ");
                int e2 = sc.nextInt();
                arr2[i][j]=e2;
            }
        }
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println("\n");
        }
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println("\n");
        }
        int addarr[][] = new int[r][c];
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                addarr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Array after Adding");
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(addarr[i][j]+" ");
            }
            System.out.println("\n");
        }

    }

}
