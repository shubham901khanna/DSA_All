package Arrays;

import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int data = scn.nextInt();



        // Logic
        int left = 0;
        int right = arr.length - 1;

        int foundAt = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (data > arr[mid]) {
                // left is useless
                left = mid + 1;
            } else if (data < arr[mid]) {
                // right is useless
                right = mid - 1;
            } else {
                foundAt = mid;
                break;
            }

        }
        System.out.println(foundAt);

    }
}
