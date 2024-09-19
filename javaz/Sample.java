package javaz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("dfdf");
        list.add("dfdfaa");
        list.add("dfdfccc");
        list.add("dfdffddgh");


        list.stream().sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
    }
}
