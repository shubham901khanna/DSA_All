package InterviewQuestions;

import java.util.Arrays;

public class MissingArray {
    public static int firstMissingPositive(int[] nums,
                                           int n) {
        Arrays.sort(nums);
        int ans = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == ans)
                ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, -7, 6, 8, 1, -10, 15};
        int n = arr.length;
        int ans = firstMissingPositive(arr, n);
        System.out.println(ans);
    }
}

