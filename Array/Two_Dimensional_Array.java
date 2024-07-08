package Array;

import java.util.Scanner;

public class Two_Dimensional_Array {
    public static void main(String[] args) {
        System.out.println("Enter the No. od Rows : ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Enter the NO. of Columns : ");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.println("Enter the element : ");
                int e = sc.nextInt();
                arr[i][j]=e;
            }
        }
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
