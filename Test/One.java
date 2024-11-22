package Test;

import java.util.Locale;

public class One {
    public static void main(String[] args) throws Throwable {
//        Object obj = "java";
//        if(obj instanceof  String s){
//            s = s.toUpperCase();
//            System.out.println(s);
//        }
//        System.out.println(obj);

        String  s ="Java";
        String str = s.toUpperCase();
        System.out.println(str);
        One one = new One();
        one.finalize();
    }

    protected void finalize() throws Throwable {
        try {;
            System.out.println("Reader closed");
        } finally {
            super.finalize();
        }
    }
}
