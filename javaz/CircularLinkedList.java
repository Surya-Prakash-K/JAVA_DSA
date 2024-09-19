package javaz;

public class CircularLinkedList {

    private Node head;
    private Node tail;

    private class Node {
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
    public void insert(int value){
        Node node = new Node(value);
        if(head ==  null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;

    }

    public void delete(int value){
        Node node = head;
        if(node == null){
            return;
        }

        if(node.value == value){
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if(n.value == value){
                node.next = n.next;
            }
            node = node.next;
        }while (node!=head);


    }

    public void display(){
        Node node =  head;
        do {
            System.out.print(node.value + " -> ");
            node = node.next;
        } while (node != head);
        System.out.println(" End ");
    }


    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.display();
        list.delete(4);
        list.display();
    }
}
