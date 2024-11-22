package javaz;

public class MakingAnagrams {

    public static void main(String[] args) {
        System.out.println(makingAnagrams("abc","amnop"));
    }
    public static int makingAnagrams(String s1, String s2) {
      int[] a_frequency = new int[26];
      int[] b_frequency = new int[26];
      int deleted = 0;
      for(char c : s1.toCharArray()){
          a_frequency[c - 'a']++;
      }

      for(char c : s2.toCharArray()){
          b_frequency[c - 'a']++;
      }

      for (int i = 0; i < 26; i++) {
            deleted+= Math.abs(a_frequency[i] - b_frequency[i]);
      }
        return deleted;

    }
}
