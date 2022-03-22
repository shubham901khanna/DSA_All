package Java8Features;

import java.util.Optional;

public class OptionalToCheckNull {

    public static void main(String[] args) {

        String[] str = new String[10];

        Optional<String> isNull = Optional.ofNullable(str[9]);
        if (isNull.isPresent()) {
            String str1 = str[9].substring(2, 5);
            System.out.println(str1);
        } else {
            System.out.println("Cannot do substring");
        }

        str[9] = "shubhamkhanna";
        Optional<String> isNull2 = Optional.ofNullable(str[9]);
        if (isNull2.isPresent()) {
            String str1 = str[9].substring(2, 5);
            System.out.println(str1);
        } else {
            System.out.println("Cannot do substring");
        }


        // Optional with filter

        //Creating Optional object from a String
        Optional<String> GOT = Optional.of("Game of Thrones");
        /* Filter returns an empty Optional instance if the output doesn't
         * contain any value, else it returns the Optional object of the
         * given value.
         */
        System.out.println(GOT.filter(s -> s.equals("GAME OF THRONES")));
        System.out.println(GOT.filter(s -> s.equalsIgnoreCase("GAME OF THRONES")));


    }
}
