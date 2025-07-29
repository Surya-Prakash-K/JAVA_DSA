package Practice;


public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    private static class Node{
       int value;
       Node next;

       public Node(int value){
          this.value = value;
       }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void addFirst (int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void addLast (int value) {
        if (tail == null){
            addFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display () {
        Node temp =  head;
        while (temp!=null){
            System.out.print(temp.value+" --> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void deleteFirst() {
        head = head.next;
        size--;
    }

    public void deleteLast() {
        if(size<=1){
            deleteFirst();
        }
        tail = get(size - 2);
        tail.next = null;
        size--;
    }

    public void delete(int index) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        temp.next.next = temp.next;
        size--;
    }

    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void insert(int index, int value){
        if(head == null){
            addFirst(value);
            return;
        }

        if (tail == null){
            addLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        System.out.println("Initial Size ====> "+ list.size);
//        list.addFirst(2);
//        list.addLast(4);
//        list.display();
        list.insert(0,9);
        list.display();
        System.out.println("Final Size ====> "+ list.size);


    }




}
