package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_element_in_array {
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
        int max = arr[0];
        for(int s = 1; s<arr.length;s++){
            if(max<arr[s]){
                max = arr[s];
            }
        }
        System.out.println(max);
    }
}
