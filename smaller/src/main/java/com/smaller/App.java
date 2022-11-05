package com.smaller;

/**
 *  Given an array of integers, return a new array where
 *  each element in the new array is the number of 
 *  smaller elements to the right of that element in the 
 *  original array.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Initial array
        int[] arr = {4, 0, 8, 6, 3, 0, 9, 5, 8, 8};
        // Empty array for function
        int[] newArr = new int[arr.length];
        // Pass original to function
        newArr = smallerElements(arr);
        // Print original array
        System.out.printf ("Original array:\t");
        for (int item: arr) {
            System.out.printf ("%d ", item);
        }
        System.out.println();
        // Print new array
        System.out.printf("New array:\t");
        for (int item: newArr) {
            System.out.printf("%d ", item);
        }
        System.out.println();
    }

    public static int[] smallerElements(int[] arr) {
        // Declare local variables
        int[] newArr = new int[arr.length];
        // Iterate through original array
        for (int i = 0; i < arr.length; i++) {
            // Used to count number of smaller elements
            int count = 0;
            // Iterate through rest of array for each item in the original
            for (int j = i+1; j < arr.length; j++) {
                // Moving right, is j < i ?
                if (arr[i] > arr[j]) {
                    // Count how many smaller elements
                    count++;
                }
            }
            // Update newArr
            newArr[i] = count;
        }
        return newArr;
    }
}
