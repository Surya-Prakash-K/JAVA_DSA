package Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxValue {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8);

        numbers.toArray(Integer[]::new);

        Optional<Integer> maxOptional = numbers.stream()
                                               .reduce((a, b) -> a > b ? a : b);

        maxOptional.ifPresent(max -> System.out.println("Maximum value: " + max));
    }
}
