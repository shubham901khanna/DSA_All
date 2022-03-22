package Strings;

public class StringBuilderConcept {

    public static void main(String [] args) {

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        char ch = sb.charAt(0);
        System.out.println(ch);

        sb.setCharAt(2,'d');
        System.out.println(sb);

        sb.insert(1,'Y');
        System.out.println(sb);

        sb.deleteCharAt(3);
        System.out.println(sb);

    }
}
