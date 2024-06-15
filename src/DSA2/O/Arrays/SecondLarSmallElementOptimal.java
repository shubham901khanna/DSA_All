package DSA2.O.Arrays;

public class SecondLarSmallElementOptimal {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        int n = arr.length;
        int secondLargest = secondLargest(arr, n);
        int secondSmallest = secondSmallest(arr, n);
        System.out.println(secondLargest);
        System.out.println(secondSmallest);
    }

    private static int secondSmallest(int[] arr, int n) {
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < ssmallest && arr[i] != smallest) {
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }

    private static int secondLargest(int[] arr, int n) {
        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}

// Time Complexity: O(N) -> single pass
