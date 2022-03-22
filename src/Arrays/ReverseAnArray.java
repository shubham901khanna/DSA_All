package Arrays;

import java.util.Scanner;

public class ReverseAnArray {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        reverse(arr);
        display(arr);

    }

    private static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void reverse(int[] arr) {
        int li = 0;
        int ri = arr.length - 1;

        // Logic- when left index crosses rigth index.
        while (li <= ri) {
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;

            li++;
            ri--;

        }


    }
}
