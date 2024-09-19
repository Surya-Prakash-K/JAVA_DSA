package javaz;

public class LinkedList {

    //Singly Linked List structure
    // head-> 2|node2 ----> 3|node3 ----> 4|node4 ----> 5|null <---tail

    private Node head;
    private Node tail;
    private int size;

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

    public void addFirst(int value){
        Node node = new Node(value);
        head = node;
        node.next = node;
        if (tail == null){
            tail = head;
        }
        size++;
    }

    private void deleteFirst(){
        head = head.next;
        size --;
    }

    public void addLast(int value){
        if (tail == null){
            addFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void deleteLast(){
        if (size <= 1){
            deleteFirst();
        }
        Node secondLast = get(size - 2);
        tail = secondLast;
        tail.next = null;
        size --;
    }

    public void add(int value, int index){
        if(head == null){
            addFirst(value);
        }
        if (tail == null){
            addLast(value);
        }

        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }

        Node node = new Node(value,temp.next);
        temp.next = node;

        size++;

    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node =  node.next;
        }
        return node;
    }


    public void delete(int index){
        if(index == 0){
            deleteFirst();
        }
        if (index == size - 1){
            deleteLast();
        }

        Node previousNode = get(index - 1);
        previousNode.next = previousNode.next.next;

        size--;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value);
            temp = temp.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        LinkedList list =  new LinkedList();
        list.addFirst(2);
        list.addLast(4);
        list.addLast(7);
        list.add(3,1);
        list.display();
        System.out.println(list.size);
//        list.deleteFirst();
//        list.display();
//        System.out.println(list.size);
//        list.deleteLast();
//        list.display();
        list.delete(2);
        list.display();
        System.out.println(list.size);



    }



}
