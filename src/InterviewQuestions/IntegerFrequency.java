package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class IntegerFrequency {
    public static void main(String[] args) {
        int arr[] = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5};
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

        for (Map.Entry<Integer, Integer> m : hm.entrySet()) {
            if (m.getValue() > arr.length / 2) {
                System.out.println("key: " + m.getKey() + "value: " + m.getValue());
            }
        }

    }


}
