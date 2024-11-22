package Practice;

public class CircularLinkedList {
    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insert(int value) {
        Node node = new Node(value);

        if(head == null){
            head = node;
            tail = node;
        }

        tail.next = node;
        tail = node;
        node.next = head;
    }

    public void delete(int value){
        Node node = head;
        if(node.value == value){
            head = head.next;
            tail.next = head;
        }

        while (node!=head){
            Node n= node.next;
            if(n.value == value){
                node.next = n.next;
            }
            node = node.next;
        }
    }

    public void display(){
        Node node = head;
        do {
            System.out.print(node.value+"-->");
            node = node.next;
        } while (node != head);
        System.out.println(" End ");
    }


    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(2);
        list.insert(6);
        list.insert(9);
        list.insert(10);
//        list.delete(2);
        list.display();
    }
}
