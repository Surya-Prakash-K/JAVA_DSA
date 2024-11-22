package javaz;

import java.util.HashSet;

public class TwoStrings {
    public static void main(String[] args) {
//        System.out.println(twoStrings("beetroot","sandals"));
        System.out.println(twoStrings2("beetroot","sandals"));
    }

    public static String twoStrings(String s1, String s2) {

        for (int i = 0; i < s1.length() ; i++) {
            for (int j = 0; j < s2.length() ; j++) {
                if(s1.charAt(i) == s2.charAt(j)){
                    return "YES";
                }
            }
        }

        return "NO";
    }

    public static String twoStrings2(String s1, String s2) {

        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for (char c : s1.toCharArray()){
            set1.add(c);
        }

        for (char c : s2.toCharArray()){
            set2.add(c);
        }

        set1.retainAll(set2);

        return !set1.isEmpty() ? "YES" : "NO";
    }
}
