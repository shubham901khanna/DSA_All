package InterviewQuestions;

// { 0, 1, 0, 2, 1, 0,
//                  1, 3, 2, 1, 2, 1 };
public class RainWater {
    private static int trapRain(int[] arr, int len) {
        // Optimal
        int left = 0;
        int right = len - 1;
        int res = 0;
        int maxleft = 0;
        int maxRight = 0;
        while (left <= right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] > maxleft) {
                    maxleft = arr[left];
                } else {
                    res += maxleft - arr[left];
                    left++;
                }
            } else {
                if (arr[right] > maxRight) {
                    maxRight = arr[right];
                } else {
                    res += maxRight - arr[right];
                    right--;
                }

            }
        }


        /*for (int i = 0; i < arr.length - 1; i++) {
            int left = arr[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }
            int rigth = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                rigth = Math.max(rigth, arr[j]);
            }
            res += Math.min(left, rigth) - arr[i];
        }*/


        return res;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0,
                1, 3, 2, 1, 2, 1};

        int len = arr.length;
        System.out.println(trapRain(arr, len));

    }
}







