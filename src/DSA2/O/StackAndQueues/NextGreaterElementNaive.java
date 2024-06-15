package DSA2.O.StackAndQueues;

public class NextGreaterElementNaive {
    public static void main(String[] args) {
        int[] arr = {11,13,21,3};
        int arrSize = arr.length;
        printNGE(arr,arrSize);
    }

    private static void printNGE(int[] arr, int arrSize) {
        int next;
        for (int i = 0; i < arrSize; i++) {
            next = -1;
            for (int j = i + 1; j < arrSize; j++) {
                if(arr[i] < arr[j]) {
                    next = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + "--" + next);
        }
    }
}

 /*   Time Complexity: O(N2)
        Auxiliary Space: O(1)*/
