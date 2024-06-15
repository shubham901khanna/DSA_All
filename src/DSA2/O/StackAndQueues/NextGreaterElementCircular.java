package DSA2.O.StackAndQueues;

import java.util.Stack;

public class NextGreaterElementCircular {
    public static void main(String[] args) {
        int[] arr = {11, 13, 21, 3};
        int arrSize = arr.length;
        printNGE(arr, arrSize);
    }

    private static void printNGE(int[] arr, int arrSize) {
        Stack<Integer> stack = new Stack<>();
        int[] nge = new int[arrSize];
        for (int i = 2 * arrSize - 1; i >= 0; i--) {
            int index = i % arrSize;
            while (!stack.isEmpty() && stack.peek() <= arr[index]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                nge[index] = stack.peek();
            } else {
                nge[index] = -1;
            }
            stack.push(arr[index]);
        }
        // Print the results
        for (int i = 0; i < arrSize; i++) {
            System.out.println(arr[i] + " --> " + nge[i]);
        }
    }

}

  /*  To handle the Next Greater Element problem for a circular array, you need to simulate the circular nature by extending the array conceptually. This can be done by traversing the array twice. Here's how you can modify the solution:

        Traverse the array twice: This will simulate the circular behavior.
        Use a stack: To keep track of the elements.
        Handle circularity: Use modulo operation to wrap around the array indices*/