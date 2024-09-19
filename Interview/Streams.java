package Interview;


import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Test {
    protected void display(){
        System.out.println("Hello");
    }
}

public class Streams {


    public static void main(String[] args) {

        Map<String, Integer> map  = new HashMap<>();
        map.put("c",3);
        map.put("b",2);
        map.put("a",1);

        LinkedHashMap<String,Integer> map1 = map.entrySet().stream().sorted((e1, e2) -> {
            return 0;
        }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(map1);

       List<Integer> integers =  List.of(1,2,3,4,5,6,7,8,9,10);

       findEven(integers);

        System.out.println(findOdd(integers).toString());
        System.out.println(findEven(integers).toString());

        Optional<Integer> max = integers.stream().max(Integer::compareTo);
        System.out.println("==========> Max "+max);


        List<String> words = Arrays.asList("apple", "banana", "cherry");
        String[] s = words.toArray(String[]::new);

        String str  = "WELCOME";

        String unique  = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println("Unique ==== "+ unique);

    }

    public static List<Integer> findOdd(List<Integer> integers){
        return integers.stream().filter( e -> e%2 != 0).collect(Collectors.toList());
    };

    public static List<Integer> findEven(List<Integer> integers){
        return integers.stream().filter( e -> e%2 == 0).collect(Collectors.toList());
    };
}
