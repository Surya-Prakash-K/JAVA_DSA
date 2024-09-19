package javaz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class ShortestCompletingWord {
    //00000000000000010021000000
    //abcdefghijklmnopqrstuvwxyz
    public static void main(String[] args) {
      String str = "1s3 PSt";
      String[] words = {"step","steps","stripe","stepple"};
      String res = shortestCompletingWord(str,words);
        System.out.println(res);
    }
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.replace(" ", "").toLowerCase();
        int[] arr = new int[26];
        for (Character c: licensePlate.toCharArray()) {
            if(Character.isLetter(c)){
                arr[c-'a']++;
            }
        }

        String result = null;
        int minLength = Integer.MAX_VALUE;
        for(String word: words){
            if(isCompletingWord(word,arr) && word.length() < minLength){
               minLength = word.length();
               result = word;
            }
        }


        return result;
    }

    private static boolean isCompletingWord(String word, int[] arr) {
        int[] chaArr = new int[26];
        for (Character c: word.toCharArray()) {
                chaArr[c-'a']++;
        }
        for(int i =0;i<26;i++){
            if(arr[i]!=chaArr[i] && chaArr[i] < arr[i]){
                return false;
            }
        }
        return true;
    }
}
