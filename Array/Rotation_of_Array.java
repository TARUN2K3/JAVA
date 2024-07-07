package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Rotation_of_Array {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the No. of Element : ");
        int n = sc.nextInt();

        int i = 0;
        int arr[] = new int[n];
        while (n>i) {
            System.out.println("Enter the Element : ");
            int x = sc.nextInt();
            arr[i] = x;
            i++;
        }
        System.out.println(Arrays.toString(arr));
/* Left Rotation-----------------------------------------
        int e = 0;
        int temp = arr[0];
        while (n-1>e) {
            arr[e] = arr[e+1];
            e++;
        }
        arr[n-1] = temp;
        System.out.println(Arrays.toString(arr)); */
// Right Rotation----------------------------------------
        int e = n-1;
        int temp = arr[n-1];
        while (e>0) {
            arr[e] = arr[e - 1];
            e--;
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
