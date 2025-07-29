package Programz;

public class StringPermutations {
    public static void main(String[] args) {
            permutations("","abc");
    }


    /*
                                        abc
                                    ("_a_"/bc)
                                /               \
                    ("_b_a_"/c)                        ("_a_b_"/c)

                  /      |        \                /        |         \
           ("cba"/"")  ("bca"/"") ("bac"/"")  ("cab"/"")  ("acb"/"")  ("abc"/"")


           if(input == ""){
           print output
           return

         _   b   _   a _
       first  second
       0,i +  + 0,length

       first = substring(0,i)
       second = substring(i,length)
       process = first + character+ second

     */
    static void permutations(String output, String input){
        if(input.isEmpty()){
            System.out.println(output);
            return;
        }

        char ch = input.charAt(0);
        for (int i = 0; i <= output.length(); i++) {
            String first = output.substring(0,i);
            String second = output.substring(i,output.length());
            permutations(first + ch + second,input.substring(1));
        }

    }

}
