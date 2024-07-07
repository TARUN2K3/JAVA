package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Inserting_element_in_Array {
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

        System.out.println("Do you want to add an extra element to the array? (true/false): ");
        boolean y = sc.nextBoolean();
        if (y) {
            System.out.println("Enter the position where you want to insert the element (0 to " + n + "): ");
            int p = sc.nextInt();
            if (p < 0 || p > n) {
                System.out.println("Invalid position! Position should be between 0 and " + n);
                return;
            }
            System.out.println("Enter the element: ");
            int e = sc.nextInt();

            // Create a new array with one extra element
            int newArr[] = new int[n + 1];
            i = 0;
            while (i < p) {
                newArr[i] = arr[i];
                i++;
            }
            newArr[p] = e;
            while (i < n) {
                newArr[i + 1] = arr[i];
                i++;
            }
            System.out.println("Array after insertion: " + Arrays.toString(newArr));
        } else {
            System.out.println("No element added.");
        }
    }
}
