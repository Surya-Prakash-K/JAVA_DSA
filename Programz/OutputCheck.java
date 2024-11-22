package Programz;


class Box{
    int size;

    Box(int size){
        this.size = size;
    }
}

public class OutputCheck {
    public static void main(String[] args) {
        int a =2; int b= 9;
        swap(a,b);
        System.out.println(""+a+""+b);

        Box box = new Box(5);
        modify(box);
        System.out.println(box.size);

    }

    static void swap(int a, int b){
        a = b;
        b = a;
    }

    static void modify(Box box){
        box.size = 10;
    }


}
