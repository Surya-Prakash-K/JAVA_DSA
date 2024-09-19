package javaz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
      String[] str = {"eat","tea","tan","ate","nat","bat"};
      List<List<String>> ans = groupAnagrams(str);
        System.out.println(ans);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            List<String> list = new ArrayList<>();
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String str = String.valueOf(arr);
            if (map.containsKey(str)) {
                map.get(str).add(strs[i]);
            } else {
                list.add(strs[i]);
                map.put(str, list);
            }
        }

        List<List<String>> finalList = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            finalList.add(entry.getValue());
        }
        return finalList;
    }
}
