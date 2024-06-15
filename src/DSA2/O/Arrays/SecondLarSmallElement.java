package DSA2.O.Arrays;

import java.util.Arrays;

public class SecondLarSmallElement {
    public static void main(String[] arg) {
        int[] arr = {1, 2, 4, 6, 7, 5};
        int size = arr.length;
        getElement(arr, size);
    }

    private static void getElement(int[] arr, int size) {
        if(size == 0  || size == 1) {
            System.out.println(-1);
        }
        Arrays.sort(arr);
        int larElement = arr[size - 2];
        int smallElement = arr[1];
        System.out.println(larElement);
        System.out.println(smallElement);
    }

}

/*
Brute force approach
        Sort the array in ascending order
        The element present at the second index is the second smallest element
        The element present at the second index from the end is the second largest element
*/

   /* Complexity Analysis
    Time Complexity: O(NlogN), For sorting the array
    Space Complexity: O(1)*/