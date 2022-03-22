package Arrays;

import java.util.*;

public class SumOfArray {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();

        // First array input.
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();


        // Second Array Input
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }

        // Output Array( Needs to be taken larger array size)

        int[] sum = new int[n1 > n2 ? n1 : n2];

        // Go to right-hand side of each array as we have to start sum from there.

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;

        // Logic

        int c = 0;
        while (k >= 0) {

            int d = c;

            if (i >= 0) {
                d += arr1[i];
            }

            if (j >= 0) {
                d += arr2[j];
            }

            c = d / 10;
            d = d % 10;

            sum[k] = d;

            i--;
            j--;
            k--;
        }
        // To print carry

        if (c > 0) {
            System.out.println(c);
        }

        for (int res = 0; res < sum.length; res++) {
            System.out.println(sum[res]);
        }

    }

}
