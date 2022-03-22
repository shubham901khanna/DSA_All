package InterviewQuestions.Arrays;

// Moore voting algo
public class MajorityElement {
    public static void main(String[] args) {
        int a[] = (new int[]{7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5});
        int size = a.length;
        System.out.println(printMajority(a, size));
    }

    private static int printMajority(int[] a, int size) {
        int count = 0;
        int cand = 0;
        for (int num : a) {
            if (count == 0) {
                cand = num;
            }
            if (num == cand) {
                count += 1;
            } else
                count -= 1;
        }
        return cand;

    }
}
