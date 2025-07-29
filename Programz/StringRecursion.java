package Programz;

public class StringRecursion {
    public static void main(String[] args) {
        String input = "bacappleadi";
        System.out.println(skipApple(input));
    }

    static void print(String input){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if(!(input.charAt(i) == 'a')){
               sb.append(input.charAt(i));
            }
        }
        System.out.println(sb);
    }

    static String skipA(String input){
        if(input.isEmpty()){
            return "";
        }
        char c = input.charAt(0);
        if(c == 'a'){
            return skipA(input.substring(1));
        } else {
            return c + skipA(input.substring(1));
        }
    }

    //abbapppledf
    //

    static String skipApple(String input){
        if(input.isEmpty()){
          return "";
        }

        if(input.startsWith("apple")){
            return skipApple(input.substring(5));
        } else {
            return input.charAt(0) + skipApple(input.substring(1));
        }
    }
}
