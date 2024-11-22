package javaz;

import java.util.Scanner;


public class InsertNodeAtTail {
      static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;

        public SinglyLinkedListNode(int data) {
            this.data = data;
        }


        public static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int value){
            SinglyLinkedListNode node = new SinglyLinkedListNode(value);
            if(head == null){
                head = node;
                return head;
            }

            SinglyLinkedListNode current = head;
            while (current.next != null){
                current = current.next;
            }

            current.next = node;
            return head;
        }

        public static void printList(SinglyLinkedListNode head) {
            SinglyLinkedListNode current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SinglyLinkedListNode head = null;
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            head = SinglyLinkedListNode.insertNodeAtTail(head,value);
        }

        SinglyLinkedListNode.printList(head);

    }

}
