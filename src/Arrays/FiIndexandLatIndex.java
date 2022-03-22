package Arrays;

import java.util.Scanner;

public class FiIndexandLatIndex {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int data = scn.nextInt();

        int left = 0;
        int rigth = arr.length - 1;
        int fi = -1;

        while (left <= rigth) {
            int mid = (left + rigth) / 2;
            if (data > arr[mid]) {
                left = mid + 1;
            } else if (data < arr[mid]) {
                rigth = mid - 1;

            } else {
                fi = mid;
                rigth = mid - 1;

            }

        }
        System.out.println(fi);

        left = 0;
        rigth = arr.length - 1;
        int li = -1;

        while (left <= rigth) {
            int mid = (left + rigth) / 2;
            if (data > arr[mid]) {
                left = mid + 1;
            } else if (data < arr[mid]) {
                rigth = mid - 1;

            } else {
                li = mid;
                left = mid + 1;

            }

        }
        System.out.println(li);


    }


}
