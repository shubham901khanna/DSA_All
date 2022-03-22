package Strings;

import java.util.Scanner;

public class StringConcept {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(str);

        System.out.println(str.length());
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
        char ch = str.charAt(2);
        System.out.println(ch);

        String str1 = "abcd";
        System.out.println(str1.substring(1, 3));


        String str2 = "abcd";
        for (int i = 0; i < str2.length(); i++) {
            for (int j = i + 1; j <= str2.length(); j++) {
                System.out.print(str2.substring(i, j));
            }
        }

        String str5 = "abc gd shs shhs js";
        String[] parts = str5.split(" ");
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }

    }
}
