package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Deleting_element_from_Array {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int i = 0;
        while (n > i) {
            System.out.println("Enter the element " + (i + 1) + ": ");
            int x = sc.nextInt();
            arr[i] = x;
            i++;
        }
        System.out.println("Original array: " + Arrays.toString(arr));

        System.out.println("You want to Delete The element form array : ");
        boolean y = sc.nextBoolean();
        if (y==true) {
            System.out.println("Which element you want to Delete : ");
            int e =sc.nextInt();
            int index = 0;
            for(int q = 0; q<n;q++ ){
                if(arr[q]==e){
                    index = q;
                    break;
                    }
                }
            int temp = arr[index];
            for(int j = index;n-1>j;j++){
                arr[j]=arr[j+1];
            }
            int newarr[] = new int[n - 1];
            for (int j = 0; j < n - 1; j++) {
                newarr[j] = arr[j];
            }
            System.out.println(Arrays.toString(newarr));
        }
    }
    
}
