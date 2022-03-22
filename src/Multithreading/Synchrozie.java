package Multithreading;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Synchrozie {
    public static void main(String args[]) {
        /*ArrayList<String> al = new ArrayList<>();
        al.add("shubham");
        al.add("khanna");
        Iterator<String> it = al.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
            al.add("hero");
        }*/
        int arr[] = {10, 2, 23, 2, 10, 5, 10, 2, 5};
        printArr(arr);

    }

    static void printArr(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer intr = hm.get(arr[i]);
            if (hm.get(arr[i]) == null) {
                hm.put(arr[i], 1);
            } else {
                hm.put(arr[i], ++intr);
            }
        }
        for(Map.Entry m : hm.entrySet()) {
            System.out.println("key: " + m.getKey() + "value: " + m.getValue());
        }

    }

    /*String str = "shubham khanna";
    Map<Character, Integer> map = new HashMap<>();
    char[] chars = str.toCharArray();
        System.out.println(chars[0]);
        for (int i = 0; i < chars.length; i++) {
        if (map.containsKey(chars[i])) {
            map.put(chars[i], map.get(chars[i]) + 1);
        } else {
            map.put(chars[i], 1);
        }
    }

       map.computeIfPresent(chars[i],(k,v) -> v + 1);
            map.computeIfAbsent(chars[i],v -> 1);
        for (Map.Entry e : map.entrySet()) {
        System.out.println(e.getKey() + "-" + e.getValue());
    }
*/
}

