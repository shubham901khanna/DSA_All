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

public class DLL {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 1};
        Node head = convertArrayToDLL(arr);
        //  head = deleteHead(head);
        // head = deleteTail(head);
        //  head = deleteK(head,1);
        // deleteNode(head.next.next.next);
        head = insertBeforeHead(head, 10);
        print(head);
    }

    private static Node insertBeforeHead(Node head, int val) {
        Node newHead = new Node(val,head,null);
        head.back = newHead;
        return newHead;
    }

    private static void deleteNode(Node temp) {
        Node prev = temp.back;
        Node front = temp.next;

        if (front == null) {
            prev.next = null;
            temp.back = null;
            return;
        }

        prev.next = front;
        front.back = prev;

        temp.next = null;
        temp.back = null;
    }

    private static Node deleteK(Node head, int k) {
        if (head == null) {
            return null;
        }
        int ct = 0;
        Node kNode = head;
        while (kNode != null) {
            ct++;
            if (ct == k) break;
            kNode = kNode.next;
        }
        Node prev = kNode.back;
        Node front = kNode.next;

        if(prev == null && front ==null) {
            return null;
        }
        else if(prev == null) {
            deleteHead(head);
        }
        else if(front == null) {
            deleteTail(head);
        }
        prev.next = front;
        front.back = prev;
        kNode.next = null;
        kNode.back = null;
        return head;
    }

    private static Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node newtail = tail.back;
        newtail.next = null;
        tail.back = null;
        return  head;
    }

    private static Node deleteHead(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        return head;
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
        while (head != null) {
            System.out.println(head.data + "");
            head = head.next;
        }
        System.out.println();
    }
}
