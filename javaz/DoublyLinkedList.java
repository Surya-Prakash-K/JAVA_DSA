package javaz;

public class DoublyLinkedList {

    //Doubly Linked List structure
    // null|2|next node --> 2|3|next node ---> 3|4|next node

    private Node head;

    class Node {
        int value;
        Node  next;
        Node  previous;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }


    public void insertFirst(int value){
        Node node = new Node(value);
        node.previous = null;
        node.next = head;
        if(head != null){
            head.previous = node;
        }
        head = node;

    }

    public void insertLast(int value){
        Node node = new Node(value);
        Node last  = head;
        node.next = null;
        if(head == null){
            node.previous = null;
            head = node;
            return;
        }
        while (last.next != null){
            last = last.next;
        }

        last.next = node;
        node.previous = last;

    }

    public void insert(int after, int value){
        Node afterNode = find(after);
        if(afterNode == null){
            System.out.println("Not Found");
        }

        Node node = new Node(value);
        node.next = afterNode.next;
        afterNode.next = node;
        node.previous = afterNode;
        if(node.next != null) {
            node.next.previous = node;
        }

    }

    public void display(){
        Node node = head;
        while (node!=null){
            System.out.print(node.value+" --> ");
            node = node.next;
        }
        System.out.println("End");
    }

    public Node find(int value){
        Node node =  head;
        while (node!= null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }


    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertLast(7);
        list.display();
        list.insert(5,7);
        list.display();

    }


}
