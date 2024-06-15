package DSA2.O.StackAndQueues;

import java.util.Stack;

public class NextGreaterElementNoncircular {
    public static void main(String[] args) {
        int[] arr = {11,13,21,3};
        int arrSize = arr.length;
        printNGE(arr,arrSize);
    }

    private static void printNGE(int[] arr, int arrSize) {
        Stack<Integer> stack = new Stack<>();
        int[] nge = new int[arrSize];
        for(int i = arrSize - 1; i >= 0; i--) {
           while (!stack.isEmpty() && stack.peek() <= arr[i]) {
               stack.pop();
           }
           if(!stack.isEmpty()) {
               nge[i] = stack.peek();
           } else {
               nge[i] = -1;
           }
           stack.push(arr[i]);
        }
        // Print the results
        for (int i = 0; i < arrSize; i++) {
            System.out.println(arr[i] + " --> " + nge[i]);
        }
    }
}

    /*To solve the Next Greater Element problem using a stack and fix the given code, you need to follow these steps:

        Traverse the array from right to left.
        Use a stack to keep track of the elements for which the next greater element has not been found yet.
        For each element, pop elements from the stack until the top of the stack is greater than the current element or the stack is empty.
        If the stack is not empty, the next greater element is the top of the stack.
        Push the current element onto the stack.
        Print or store the results accordingly.*/