package Programz;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("rat","car"));
    }
    public static boolean isAnagram(String s, String t) {
        int a_length = s.length();
        int b_length = t.length();

        if(a_length != b_length){
            return false;
        }
        int[] arr1 = new int[26];
        for (char n : s.toLowerCase().toCharArray()){
            arr1[n - 'a']++;
        }

        for (char n : t.toLowerCase().toCharArray()){
            arr1[n - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if(arr1[i]!=0) return false;
        }

        return true;
    }
}
