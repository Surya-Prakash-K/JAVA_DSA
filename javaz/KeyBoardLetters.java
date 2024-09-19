package javaz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyBoardLetters {
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] res = findWords(words);
        for (String re : res) {
            System.out.println(re);
        }
    }

    public static String[] findWords(String[] words) {
        HashMap<Integer,String> map = new HashMap<>();

        String[] keyboards = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        for (int i = 0; i < words.length; i++) {
            int size = words[i].length();
            char[] word = words[i].toCharArray();
            int pointer = 0;
            int counter = 0;
            int num = 1;
            for (int j = 0; j < size; j += num) {
                String current = String.valueOf(word[j]).toLowerCase();
                if (pointer != 3 && !keyboards[pointer].contains(current)) {
                    pointer++;
                    j = 0;
                    num = 0;
                } else {
                    counter++;
                    num = 0;
                    j++;
                }
            }
            if (counter == size) {
                map.put(i,words[i]);
            }
        }
        int k =0;
        String[] wordsArray = new String[map.size()];
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            wordsArray[k] = entry.getValue();
            k++;
        }
        return wordsArray;
    }
}
