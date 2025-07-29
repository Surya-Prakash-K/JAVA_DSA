package Practice;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

public class FailSafeExample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "A");
        map.put("2", "B");
        map.put("3", "C");

        int i = 1;
        while (i < 100){
            map.put(String.valueOf(i),"");
            i++;

        }

        System.out.println(map);
    }
}
