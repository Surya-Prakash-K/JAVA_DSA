package javaz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
       String str = "Hi this is Surya";
        System.out.println(reverse2(str));
    }

    public static String reverse(String str){
        String[] arr = str.split(" ");
        int first = 0;
        int last = arr.length - 1;
        String temp = "";
        while (last > first){
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        return Arrays.toString(arr);
    }

    public static String reverse2(String str){
        List<String> list = new ArrayList<>(List.of(str.split(" ")));
        Collections.reverse(list);
        return String.join(" ",list);
    }


}
