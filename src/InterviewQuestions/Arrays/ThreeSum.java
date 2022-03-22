package InterviewQuestions.Arrays;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int A[] = {1, 4, 45, 6, 10, 8};
        int sum = 22;
        int arr_size = A.length;
        find3Numbers(A, arr_size, sum);
    }

    private static boolean find3Numbers(int[] a, int arr_size, int sum) {
        Arrays.sort(a);
        for (int i = 0; i < a.length - 2; i++) {
            int l = i + 1;
            int r = a.length - 1;
            while (l < r) {
                if (a[l] + a[r] + a[i] == sum) {
                    System.out.println("Triplet is " + a[i] + ", " + a[l] + ", " + a[r]);
                    return  true;
                } else if (a[l] + a[r] + a[i] < sum) {
                    l++;
                } else {
                    r--;
                }

            }


        }
        return false;

    }


}
