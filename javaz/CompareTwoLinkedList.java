package javaz;

import java.util.Scanner;

public class CompareTwoLinkedList {

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        Node head1 = null;
        Node tail1 = null;
        for (int i = 0; i < n1; i++) {
            int data = scanner.nextInt();
            Node newNode = new Node(data);
            if (head1 == null) {
                head1 = newNode;
                tail1 = newNode;
            } else {
                tail1.next = newNode;
                tail1 = newNode;
            }
        }

        int n2 = scanner.nextInt();
        Node head2 = null;
        Node tail2 = null;
        for (int i = 0; i < n2; i++) {
            int data = scanner.nextInt();
            Node newNode = new Node(data);
            if (head2 == null) {
                head2 = newNode;
                tail2 = newNode;
            } else {
                tail2.next = newNode;
                tail2 = newNode;
            }
        }

        scanner.close();

        System.out.println(compare(head1,head2));
        System.out.println(compare(head1,head2));

    }


    public static int compare(Node head1,Node head2){
        if(head1 == null && head2 == null) return 1;
        if(head1 == null && head2 != null) return 0;
        if(head1 != null && head2 == null) return 0;
        if(head1.value != head2.value) return 0;

        return compare(head1.next,head2.next);
    }
}
