package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Second_largest_element_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element you wnat to Enter : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int i = 0;
        while (i<n) {
            System.out.println("Enter the element : ");
            int x = sc.nextInt();
            arr[i]=x;
            i++;
        }
        System.out.println(Arrays.toString(arr));
        int max1=arr[0];
        int max2=arr[0];
        for(int s = 0; s<arr.length; s++){
            if(arr[s]>max1){
                max2 = max1;
                max1 = arr[s];
            }else if(arr[s]>max2){
                max2 = arr[s];
            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }
}
