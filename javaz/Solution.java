package javaz;

//class Solution {
//
//
//    Node reverseList(Node head) {
//       Node prev = null;
//       Node current = head;
//       Node next = null;
//
//       while(current!=null){
//           next = current.next;
//           current.next = prev;
//           prev = current;
//           current = next;
//       }
//       head = prev;
//       return head;
//    }
//
//    class Node{
//        int value;
//        Node next;
//        Node(int value) {
//            this.value = value;
//        }
//    }
//}

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
//        solution.find();

        String s = "adda";

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        String res = "";
        for (int i = 0; i < str.length()-1; i++) {
            res += str.substring(i,k)+" ";
        }

        System.out.println(res);

    }

    public void find(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Player[] players = new Player[n];
        for (int i = 0; i < n; i++) {
            String name  = scanner.next();
            int score = scanner.nextInt();
            players[i] = new Player(name, score);
        }

        Arrays.sort(players, new Checker());

        for(int i=0;i<players.length;i++){
            System.out.println(players[i].name +" "+ players[i].score);
        }

    }

    class Checker implements Comparator<Player> {
        public int compare(Player o1, Player o2){
            if(o1.score ==  o2.score){
                return o1.name.compareTo(o2.name);
            }
            return o2.score - o1.score;
        }
    }

    class Player{
        String name;
        int score;

        Player(String name, int score){
            this.name = name;
            this.score = score;
        }
    }
}