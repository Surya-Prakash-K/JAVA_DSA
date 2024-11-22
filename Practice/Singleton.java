package Practice;

import java.util.Scanner;

public class Singleton {
    private static Singleton instance = null;
    public String str;
    private Singleton(){};
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        Singleton obj = Singleton.getInstance();
        obj.str = "Hello I am a singleton! Let me say "+ string +" to you";
        System.out.println(obj.str);
    }


}
