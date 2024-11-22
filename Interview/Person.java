package Interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


class Person {
    int id;
    String name;
    int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Map<String, Person> map = new HashMap<>();
        map.put("g", new Person(5, "EE", 51));
        map.put("a", new Person(4, "DD", 25));
        map.put("e", new Person(3, "CC", 22));
        System.out.println(map);

        Map<String, Person> res = map.entrySet().stream().sorted(Comparator.comparingInt(e -> e.getValue().age))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        Map<String, Person> result  = map.entrySet().stream().sorted(Map.Entry.<String , Person> comparingByValue(Comparator.comparingInt(e -> e.age)).reversed())
                        .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println("====ASC" + res);
        System.out.println("====DESC"+ result);

        int[] arr1 = {-1,0, 5, 6, 10};
        int[] arr2 = {1, 2, 3, 7, 9, 11};
        int[] arr3 = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().toArray();
        System.out.println(Arrays.toString(arr3));

        List<String> names = List.of("Sachin Tendulkar", "MS Dhoni", "Virat Kohli", "Lionel Messi",
                "Cristiano Ronaldo", "Roger Federer", "Muhammad Ali", "Michael Jordan");

        String longest = names.stream().max(Comparator.comparing(String::length)).orElse(null);
        System.out.println("-----longest"+longest);

        String shortest = names.stream().min(Comparator.comparing(String::length)).orElse(null);
        System.out.println("-----shortest"+shortest);

        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 3, 1, 5, 6);
        List<Integer> noDuplicates = numbers.stream()
                .collect(Collectors.groupingBy(e1 -> e1,Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(noDuplicates);

        String str = "sms";
        Character ch =
                 str
                .chars()
                .mapToObj( s -> Character.toLowerCase((char) s))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        System.out.println(ch);
    }
}

