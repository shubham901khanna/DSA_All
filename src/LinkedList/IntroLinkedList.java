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

    private static void print(Node head) {
        while(head != null) {
            System.out.println(head.data + "");
            head = head.next;
        }
        System.out.println();
    }

    private static Node deleteNodeFromHead(Node head) {
        if (head == null) return head;
        head = head.next;
        return head;
    }

    private static Node deleteNodeFromTail(Node head) {
        if(head == null || head.next == null) return null;
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;

    }

    private static Node deleteNodeFromk(Node head, int k) {
        if (head == null) return head;
        if (k == 1) {
            return head;
        }
        int ct = 0;
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            ct++;
            if (ct == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static Node deleteNodeVal(Node head, int val) {
        if (head == null) return head;
        if (head.data == 1) {
            return head;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.data == val) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static Node insertHead(Node head, int val) {
        return new Node(val,head);
    }

    private static Node insertTail(Node head, int i) {
        if(head == null) {
            return new Node(i);
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(i);
        temp.next = newNode;
        return head;
    }

    private static Node insertPosition(Node head, int el, int k) {
        if(head == null) {
            if (k ==1) {
                return new Node(el);
            } else {
                return head;
            }
        }
        if(k == 1) {
            return new Node(el, head);
        }
        int ct = 0;
        Node temp = head;
        while (temp != null) {
            ct++;
            if(ct == k-1) {
                Node newNode = new Node(el,temp.next);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 1};
        Node head = convertToArray(arr);
        //  System.out.println(lengthofLL(head));
        //  System.out.println(head.data);
        // Traversal
        Node temp = head;
        while (temp != null) {
            //  System.out.println(temp.data);
            temp = temp.next;
        }
        // delete a node of LL from head
        //  head = deleteNodeFromHead(head);
        // delete a node of LL from tail
       // head = deleteNodeFromTail(head);
        // delete a node of LL based on K
        // deleteNodeFromk(head,5);
       // deleteNodeVal(head, 1);
       //  head = insertHead(head, 100);
      //  head = insertTail(head, 100);
        head = insertPosition(head, 100, 1);
        print(head);
    }




}
