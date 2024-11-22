package javaz;

import java.util.Scanner;

public class InsertNodeAtHead {

    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;

        public SinglyLinkedListNode(int data) {
            this.data = data;
        }


        public static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int value){
            SinglyLinkedListNode node = new SinglyLinkedListNode(value);
            if(head == null)  return node;
            node.next = head;
            head = node;
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
            head = SinglyLinkedListNode.insertNodeAtHead(head,value);
        }

       SinglyLinkedListNode.printList(head);

    }
}
