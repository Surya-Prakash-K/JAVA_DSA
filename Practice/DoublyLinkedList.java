package Practice;

public class DoublyLinkedList {

    private Node head;

    class Node{
        int value;
        Node next;
        Node previous;

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
        node.next = head;
        node.previous = null;
        if (head!=null){
            head.previous = node;
        }
        head = node;
    }

    public void insertLast(int value){
        Node node = new Node(value);

    }

    public void insert(int after, int value){
       Node p = find(after);
       Node node = new Node(value);
       node.next = p.next;
       p.next = node;
       node.previous = p;
       if(node.next!=null) {
           node.next.previous = node;
       }
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+"--->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public Node find(int value) {
        Node temp = head;
        while (temp!=null){
            if(temp.value == value){
               return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(1);
        list.insertFirst(3);
        list.display();
    }
}
