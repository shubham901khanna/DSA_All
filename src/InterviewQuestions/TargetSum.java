package InterviewQuestions;

import java.util.HashSet;

public class TargetSum {
    static void printpairs(int[] arr, int sum) {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i) {
            int temp = sum - arr[i];
            if (s.contains(temp)) {
                System.out.println(
                        "Pair with given sum "
                                + sum + " is (" + arr[i]
                                + ", " + temp + ")");
            }
            s.add(arr[i]);
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7} ;
        int sum = 9;
        printpairs(arr, sum);
    }
}
