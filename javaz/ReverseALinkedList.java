package javaz;

import java.util.ArrayList;
import java.util.List;

public class ReverseALinkedList {
    private Node head;
    private Node tail;


    private static class Node {
         int data;
         Node next;

        public Node(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    public void insertNode(int nodeData) {
        Node node = new Node(nodeData);
        if (head == null) {
            head = node;
        }
        tail.next = node;
        tail = node;
    }
    /*
         |
       prev    5   ->  4  ->  3 ->  2 -> 1 -> null
               |       |
              current  next

       null <- 5  <- 4  <- 3 <- 2 <- 1
                                    head
       current.next = prev
       prev = current
       current = next
       next = next.next
     */

    public static Node reverse(Node head) {

        Node prev = null;
        Node current = head;
        Node next = current.next;

        while (current!=null){
            current.next = prev;
            prev = current;
            current = next;

            if(next!=null){
                next = next.next;
            }
        }

        return prev;
    }



    public static void main(String[] args) {
        System.out.println();
    }


}


