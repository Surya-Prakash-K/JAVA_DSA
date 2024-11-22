package javaz;

public class InsertInSinglyLinkedList {

    public  Node head;
    public  Node tail;

    class Node {
        public int data;
        public Node next;

        public Node(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }


        public void insertNode(int nodeData) {
            Node node = new Node(nodeData);
            if (head == null) {
                head = node;
            } else {
                tail.next = node;
            }

            tail = node;
        }

        public  Node insert(int data, int position) {
            Node temp = head;
            for (int i = 0; i < position; i++) {
                temp = temp.next;
            }
            Node node = new Node(data);
            temp.next = node;
            return node;
        }

        public static void main(String[] args) {
        InsertInSinglyLinkedList singlyLinkedList = new InsertInSinglyLinkedList();

    }

}


