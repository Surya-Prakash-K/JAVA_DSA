package javaz;

import java.util.Arrays;

public class AnagramHackerrank {
    public static void main(String[] args) {
        System.out.println(isAnagram2("abc","cat"));
    }

    public static boolean isAnagram(String a,String b) {
        int a_length = a.length();
        int b_length = b.length();

        if(a_length != b_length){
            return false;
        }

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);


        return Arrays.equals(arr1, arr2);
    }

    public static boolean isAnagram2(String a,String b) {
        int a_length = a.length();
        int b_length = b.length();

        if(a_length != b_length){
            return false;
        }

        int[] char_frequency = new int[26];

       for (char c : a.toLowerCase().toCharArray()){
           char_frequency[c - 'a']++;
       }

        for (char c : b.toLowerCase().toCharArray()){
            char_frequency[c - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if(char_frequency[i]!=0) return false;
        }
        return true;
    }
}
