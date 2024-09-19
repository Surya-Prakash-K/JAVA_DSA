package javaz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueMorseCode {
    public static void main(String[] args) {

        String[] words = {"gin", "zen", "gig", "msg"};
        int res = uniqueMorseRepresentations2(words);

    }

        public static int uniqueMorseRepresentations(String[] words){
            String[]arr = {
                    ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                    "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                    "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
            };
            HashMap<Character, String> map = new HashMap<>();
            int j = 0;
            for (char i = 'a'; i <= 'z'; i++) {
                map.put(i, arr[j]);
                j++;
            }

            List<String> list = new ArrayList<>();

            for (int i = 0; i < words.length; i++) {
                char[] chars = words[i].toCharArray();
                String str = "";
                for (int k = 0; k < chars.length; k++) {
                    str += map.get(chars[k]);
                }
                list.add(str);
                str = "";

            }

            Set<String > set = new HashSet<>();
            set.addAll(list);

            return set.size();
        }

    public static int uniqueMorseRepresentations2(String[] words){
        HashSet<String> set = new HashSet<>();

        String[] arr = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

        for(String word : words){
            StringBuilder str = new StringBuilder();
            for(Character c: word.toCharArray()){
                str.append(arr[c-'a']);
            }

            set.add(str.toString());
        }

        return set.size();
    }


}
