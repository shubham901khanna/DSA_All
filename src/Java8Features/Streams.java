package Java8Features;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Streams {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Shubham");
        list.add("Anu");

       long count =  list.stream().filter(str -> str.length() < 6).count();
       System.out.println(count);
/*
        List<String> st = Arrays.asList("shubham","khanna","shubham");
        Map<String,Long> map = st.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);*/

        // Iterating and displaying selected integers

        // Stream.iterate(1, count -> count + 1).filter(number -> number % 3 == 0).limit(5).forEach(System.out::print);

        // Stream.concat(), Stream.allMatch(), Stream.anyMatch(), Stream.noneMatch();

    }


}
