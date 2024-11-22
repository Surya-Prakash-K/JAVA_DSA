package javaz;



public class Stack {
    protected static int[] data;
    private static final int DEFAULT_SIZE = 10;

    int pointer = -1;

    public Stack() {
        this.data = new int[DEFAULT_SIZE];
    }

    public Stack(int size) {
        this.data = new int[size];
    }

    public boolean push(int value) {
        if (isFull()) {
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
            return false;
        }
        pointer++;
        data[pointer] = value;
        return true;
    }

    public int peek() throws Exception{
        if (isEmpty()) {
            throw new Exception("Peek is Empty");
        }
        return data[pointer];
    }

    public int pop() throws Exception{
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        /*int value = data[pointer] ;
        pointer --;
        return value;*/
        return data[pointer--];
    }

    public boolean isFull() {
        return pointer == data.length - 1;
    }

    public boolean isEmpty() {
        return pointer == -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(2);

//        System

    }
}





