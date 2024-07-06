package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Searching_element_in_array {
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
        System.out.println("Element you want to Find : ");
        int f = sc.nextInt();
        int index = -1;
        for(int s = 0;s<arr.length;s++){
            if(arr[s] == f ){
                index = s;
                break;
            }
        }
        if(index != -1)
        {
            System.out.format("The index of %d element is %d ",f,index);
        }
        else{
            System.out.println("Element Not found");
        }
    }
}
