package Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimes {

    public static void main(String[] args[]) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

     /* //  int[] arr = new int[n];
        for (int i = 0; i <= arr.length; i++) {
            arr[i] = scn.nextInt();
        }*/

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(scn.nextInt());
        }


    }


}
