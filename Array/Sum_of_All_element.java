package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_of_All_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Elements you want to enter : ");
        int n = sc.nextInt();


        int arr[] = new int[n];
        int i = 0;
        while(n>i){
            System.out.println("Enter the element of Array : ");
            int x = sc.nextInt();
            arr[i] = x;
            i++;
        }
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for(int s = 0;s<arr.length;s++){
            sum = sum+arr[s];
        }
        System.out.println(sum);
    }
}
