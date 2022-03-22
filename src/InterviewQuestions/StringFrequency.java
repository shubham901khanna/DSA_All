package InterviewQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class StringFrequency {
    public static void main(String[] args) {
        String str = "shubham khanna";
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] chars = str.toCharArray();
        System.out.println(chars[0]);
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                map.put(chars[i], map.get(chars[i]) + 1);
            } else {
                map.put(chars[i], 1);
            }
        }
        for (Map.Entry e : map.entrySet()) {
            System.out.println(e.getKey() + "-" + e.getValue());
        }
    }
}
