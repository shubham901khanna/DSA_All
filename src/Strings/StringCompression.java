package Strings;

import java.util.*;

public class StringCompression {

    public static String compression1(String str) {
        // write your code here

        String ans = "";
        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == str.charAt(i + 1)) {

            } else {
                ans += str.charAt(i);
            }

        }
        ans += str.charAt(str.length() - 1);

        return ans;
    }

    public static String compression2(String str) {
        // write your code here

     /*   for (int i = 0; i < str.length(); i++) {
            char fich = str.charAt(i);
            char fiscnd = str.charAt(i + 1);
            int count = 0;
            if (fich == fiscnd) {
                count++;
            }
        }*/

        String fich = str.charAt(0) + "";
        int count = 1;

        for (int i = 1; i < str.length() - 1; i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            if (curr == prev) {
               count ++;
            } else {
                if (count > 1) {
                    fich += count;
                    count = 1;
                }
                fich = fich + curr;
            }


        }
        if (count > 1) {
            fich += count;
            count = 1;
        }

        return fich;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }

}