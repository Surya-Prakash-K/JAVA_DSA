package javaz;

import java.util.StringJoiner;

public class Queue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

   public Queue(int size){
       this.data = new int[size];
   }

   public Queue(){
   }


    public static void main(String[] args) {
        StringJoiner joinStrings = new StringJoiner(",", "[", "]");
    }
}
