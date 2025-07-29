package javaz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LetterCombination {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }

    public static List<String> letterCombinations(String digits) {
        LinkedList<String> list = new LinkedList<>();
        list.add("");
        String[] char_map = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for (int i = 0; i < digits.length(); i++) {
            int index = Character.getNumericValue(digits.charAt(i));
            while (list.peek().length() == i) {
                String permutation = list.remove();
                for (char c : char_map[index].toCharArray()) {
                    list.add(permutation + c);
                }
            }
        }

        return list;
    }


    public static List<String> letterCombinationsTwo(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }

        String[] charMap = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        generateCombinations("", digits, 0, charMap, result);
        return result;
    }

    private static void generateCombinations(String current, String digits, int index, String[] charMap, List<String> result) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        String letters = charMap[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            generateCombinations(current + letter, digits, index + 1, charMap, result);
        }
    }


}
