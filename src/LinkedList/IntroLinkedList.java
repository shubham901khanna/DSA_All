package LinkedList;


class Node {
    public int data;
    public Node next;

    Node() {
        this.data = 0;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
};

public class IntroLinkedList {

    private static Node convertToArray(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    // Length of LL
    private static int lengthofLL(Node head) {
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }


    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 1};
        Node head = convertToArray(arr);
        System.out.println(lengthofLL(head));
        System.out.println(head.data);
        // Traversal
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


}
