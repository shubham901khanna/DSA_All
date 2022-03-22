package Java8Features;

import java.util.*;

public class LambdaExp {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("shubham");
        list.add("ashok");
        list.add("dinesh");
        list.add("himanshu");

        // using lambda exp.

        list.forEach((names) -> System.out.println(names));

/*
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Orange");
        map.put(3, "Banana");

        map.forEach((k, v) -> System.out.println(k + "" + v));*/

    }
}
