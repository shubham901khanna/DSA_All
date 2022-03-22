package Java8Features;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class StreamFilter {

    public static void main(String[] args) {

      /*  List<String> list = Arrays.asList("shubham", "sjns", "bhjbs");

        List<String> names = list.stream().filter(str -> str.length() > 4).collect(Collectors.toList());

        names.forEach(System.out::println);*/


        // Filter Map by keys and values

        // Filter by Keys

        Map<Integer, String> hmap = new HashMap<>();
        hmap.put(1, "shubham");
        hmap.put(2, "veer");
        hmap.put(3, "kuldeep");

        Map<Integer, String> result = hmap.entrySet().stream().
                filter(map -> map.getKey().intValue() <= 2).
                collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

        // Filter map by  values

        Map<Integer, String> result1 = hmap.entrySet().stream().
                filter(map -> "shubham".equals(map.getValue())).
                collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

        System.out.println("Result" + result);

        //.filter(Objects::nonNull)


    }


}
