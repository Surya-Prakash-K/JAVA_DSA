package Interview;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Test {
    static protected void display(){
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

        String uniqueCharacters = str.chars()
                .mapToObj(item -> (char) item)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println("==== Unique ===="+uniqueCharacters);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("arun",24,10000));
        employeeList.add(new Employee("siva",25,20000));
        employeeList.add(new Employee("kumar",26,30000));
        Optional<Employee> optionalEmployee = employeeList
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1)
                .findFirst();

        System.out.println("===============Second Highest salary"+optionalEmployee.get());

        Optional<Employee> optionalEmployee1 =
                employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("=========="+optionalEmployee1);


        LinkedList<String> list = new LinkedList<>();
        list.add("");

        System.out.println(reverse("surya"));



    }

    public static String reverse(String string) {
        return Stream.of(string)
                .map(word->new StringBuilder(word).reverse())
                .collect(Collectors.joining(""));
    }

    public static List<Integer> findOdd(List<Integer> integers){
        return integers.stream().filter( e -> e%2 != 0).collect(Collectors.toList());
    };

    public static List<Integer> findEven(List<Integer> integers){
        return integers.stream().filter( e -> e%2 == 0).collect(Collectors.toList());
    };

    public static int birthdayCakeCandles(List<Integer> candles) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (Integer num : candles) {
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }

        Optional<Integer> largest =  map.entrySet().stream().max(Map.Entry.comparingByKey())
                .map(Map.Entry::getValue);

        return largest.get();

    }
}
