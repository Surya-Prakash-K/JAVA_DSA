package Programz;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationRecursive {

    public static void main(String[] args) {
          List<String> res = formSequence2("","23");
        System.out.println(res);
    }

    private static void formSequence(String output, String input) {
        if(input.isEmpty()){
            System.out.println(output);
            return;
        }

        int digit =  input.charAt(0) - '0';
        System.out.println("======digit "+digit);
        for (int i = (digit - 1)* 3; i < digit*3 ; i++) {
            char c =  (char)('a' - i);
            System.out.println("---->char " +c);
            formSequence(output + c,input.substring(1));
        }
    }


    /*
                                     (""/ "12")
                                         abc def

                a/def                    b/def                    c/def
             /    |   \               /     |     \            /   |    \
     (ad/"")  (ae/"")  (af/"")   (bd/"" ) (be/"") (bf/"")  (cd/"") (ce/"") (cf/"")


     */



    private static List<String > formSequence2(String output, String input) {
        if (input.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(output);
            return list;
        }

        String[] charMap = new String[]{
                "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        int digit = input.charAt(0) - '0';

        List<String> list = new ArrayList<>();
        // Get the corresponding letters for this digit
        String letters = charMap[digit];

        // Loop through each letter and form the sequence recursively
        for (char c : letters.toCharArray()) {
            list.addAll(formSequence2(output + c, input.substring(1)));
        }
        return list;
    }

    /*
                            formSequence("", "23")

                         /             |                       \
                      "a"              "b"                     "c"
                     /|\               /|\                     /|\
        formSequence("a", "3")      formSequence("b", "3")     formSequence("c", "3")
          /     |     \            /     |     \                /     |     \
    "ad"    "ae"   "af"         "bd"   "be"   "bf"             "cd"   "ce"   "cf"
    formSequence("ad", "")      formSequence("ae", "") ...    formSequence("cf", "")
     |        |       |            |        |     |               |       |      |
    "ad"     "ae"    "af"        "bd"     "be"  "bf"             "cd"    "ce"   "cf"


     */

}
