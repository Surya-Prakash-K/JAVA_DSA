package javaz;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Occurrences {

    //occurrence
    //o1c3u1r2e2n1
    public static void main(String[] args) {
        String str = "Occurrence";
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for (Character c : str.toLowerCase().toCharArray()){
            if (!map.containsKey(c)){
                map.put(c,1);
            } else {
                map.put(c,map.get(c)+1);
            }
        }
        StringBuilder res  = new StringBuilder();

        map.forEach((key, value) -> res.append(key).append(value));
        System.out.println(res);

        int[] count = new int[57];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)-'A']++;
        }

        for (int i = 0; i < str.length(); i++) {
            if(count[str.charAt(i) - 'A'] > 0){
                System.out.print(str.charAt(i)+""+ count[str.charAt(i)-'A']);
                count[str.charAt(i)-'A'] = 0;
            }
        }

    }

    /*111111111
      100000001
      101111101
      101000101
      101010101
      101000101
      101111101
      100000001
      111111111
     */


}
