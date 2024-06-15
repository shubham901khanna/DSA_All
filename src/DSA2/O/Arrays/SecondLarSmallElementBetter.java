package DSA2.O.Arrays;

public class SecondLarSmallElementBetter {
    public static void main(String[] arg) {
        int[] arr = {1, -2, 4, 6, 7, 5};
        int n = arr.length;
        getLargestElement(arr, n);
    }

    private static void getLargestElement(int[] arr, int n) {
        if (n < 2) {
            System.out.println(-1);
            return;
        }
        int largestElement = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > largestElement) {
                largestElement = arr[i];
            }
        }
        // int sLargest = -1;
        int sLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > sLargest && arr[i] != largestElement) {
                sLargest = arr[i];
            }
        }
        System.out.println(largestElement);
        System.out.println("Second largest element: " + sLargest);
    }
}

// Time Complexity: O(2N)