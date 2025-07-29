package Programz;

public class StringSubSequence {
    public static void main(String[] args) {
        subSequence("","abc");
    }
    /*

                                (a b c)
                 output  /  input        output \  input
                   ("a"/ bc)                  (""/bc)
                  |        |                       /        \
          ("ab"/c)           ("a"/c)              ("b"/c)     (""/c)
           |      |           |      \            /       \         /      \
     ("abc"/"")   ("ab"/"")  ("ac"/"")  (a/"")  ("bc"/"") ("b"/"") ("c"/"") (""/"")
                output / input


         if(input == ""){
          print(output)
          return;
          }
     */


    static void subSequence(String output,String input){
        if(input.isEmpty()){
            System.out.println(output);
            return;

        }
        char c = input.charAt(0);
        subSequence(output + c , input.substring(1));
        subSequence(output,input.substring(1));
    }
}
