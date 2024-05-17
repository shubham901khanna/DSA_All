package LinkedList;

class Node {
     int data;
     Node next;
     Node back;

    Node() {
        this.data = 0;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next, Node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }
};

public class DLL{
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 1};
        Node head = convertArrayToDLL(arr);
        print(head);
    }

    private static Node convertArrayToDLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static void print(Node head) {
        while(head != null) {
            System.out.println(head.data + "");
            head = head.next;
        }
        System.out.println();
    }
}
