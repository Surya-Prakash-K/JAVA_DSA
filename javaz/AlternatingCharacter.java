package javaz;

public class AlternatingCharacter {

    public static void main(String[] args) {
        System.out.println(alter("AAABBB"));
    }

    public static int alter(String s) {
        int deleted = 0;
        for (int i = 0; i < s.length() -1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                deleted++;
            }
        }
        return deleted;
    }
}
