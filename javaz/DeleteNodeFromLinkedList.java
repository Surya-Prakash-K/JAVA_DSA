package javaz;

public class DeleteNodeFromLinkedList {

    class Node {
         int value;
         Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    public static Node deleteNode(Node head, int position) {
        if (head == null) return head;
        if (position == 0) return head.next;

        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }

       current.next = current.next.next;
       return head;
    }
}
