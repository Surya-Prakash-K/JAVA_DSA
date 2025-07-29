package Sample;

import java.util.List;


public class Test {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,3,4,6,7);

                  list
                 .stream()
                 .filter(a -> a%2 == 0)
                 .forEach(System.out::println);



    }


}




