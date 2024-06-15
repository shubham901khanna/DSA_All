package DSA2.O.StackAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSample {
    public static void main(String[] args ) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("Queue is" + queue);
        // Removing elements from the queue
        int removedElement = queue.poll(); // poll() removes and returns the head of the queue
        System.out.println("Removed Element: " + removedElement);

        // Displaying the queue after removing an element
        System.out.println("Queue after removal: " + queue);

        // Accessing the head of the queue
        int head = queue.peek(); // peek() returns the head of the queue without removing it
        System.out.println("Head of the Queue: " + head);

        // Checking if the queue is empty
        boolean isEmpty = queue.isEmpty();
    }
}
