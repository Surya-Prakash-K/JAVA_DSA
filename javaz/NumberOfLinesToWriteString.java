package javaz;

import java.util.Arrays;

public class NumberOfLinesToWriteString {
    public static void main(String[] args) {
        int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "bbbcccdddaaa";

        int[] result = numberOfLines2(widths,s);
        System.out.println(Arrays.toString(result));
    }

    public static int[] numberOfLines(int[] widths, String s) {
        int pixel = 100;
        int rows = 0;

        int totalWidth = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a';
            totalWidth += widths[index];
            if (totalWidth == pixel && i == s.length() - 1) {
                rows++;
            } else if (totalWidth == pixel) {
                totalWidth = 0;
                rows++;
            } else if (totalWidth > 100) {
                totalWidth = widths[index];
                rows++;
            }
        }
        
        return new int[]{rows+1,totalWidth};
    }

    public static int[] numberOfLines2(int[] widths, String s) {
        int res[] = new int[2];
        int totalWidth = 0;
        int rows = 1;

        for(int i = 0; i < s.length(); i++){
            int index = widths[s.charAt(i) - 97];
            totalWidth += index;
            if(totalWidth > 100){
                totalWidth = index;
                rows++;
            }
        }
        res[0] = rows;
        res[1] = totalWidth;

        return res;
    }
}
