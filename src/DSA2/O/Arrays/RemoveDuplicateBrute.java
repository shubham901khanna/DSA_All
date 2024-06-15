package DSA2.O.Arrays;

import java.util.HashSet;

public class RemoveDuplicateBrute {
    public static void main(String[] arg) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicate(arr);
        System.out.println(k);
    }

    private static int removeDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for(int x: set) {
            arr[j++] = x;
        }
        return k;
    }
}

/*
Approach:

        Declare a HashSet.
        Run a for loop from starting to the end.
        Put every element of the array in the set.
        Store size of the set in a variable K.
        Now put all elements of the set in the array from the starting of the array.
        Return K.

    Time complexity: O(n*log(n))+O(n)

        Space Complexity: O(n) */
