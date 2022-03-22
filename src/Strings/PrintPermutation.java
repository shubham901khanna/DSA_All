package Strings;

import java.util.Scanner;

public class PrintPermutation {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        Solution(str);
    }

    private static void Solution(String str) {

        int len = str.length();
        int f = Factorial(len);

        for (int i = 0; i <= f; i++) {
            StringBuilder stb = new StringBuilder(str);
            int temp = i;
            for (int div = len; div >= 1; div--) {
                int q = i / div;
                int rem = i % div;
                System.out.println(stb.charAt(rem));
                stb.deleteCharAt(rem);

                temp = q;}
        }
      //  System.out.println();

    }

    public static int Factorial(int n) {
        int val = 1;
        for (int i = 2; i <= n; i++) {
            val = val * i;
        }
        return val;
    }
}
