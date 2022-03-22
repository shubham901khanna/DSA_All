package Collections;

import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(102,"shubham");
        map.put(103,"khanna");
        map.put(104,"ashish");

     //   map.forEach((k,v) -> System.out.println(k + "" + v));
        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
        List<Map.Entry<Integer,String>> list = new ArrayList<>(entrySet);
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        list.forEach(s -> { System.out.println(s.getKey() + "" + s.getValue());});

    }
}
