package lotto.model;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Arrange {
    public static List<Integer> sortNumbers(List<Integer> numbers) {
        List<Integer> sorted = new ArrayList<>(numbers);
        Collections.sort(sorted);
        return sorted;
    }

    public static List<Integer> parseAndSort(String input) {
        List<Integer> numbers = parseNumbers(input);
        return sortNumbers(numbers);
    }

    private static List<Integer> parseNumbers(String input) {
        return java.util.Arrays.stream(input.split(",|\\s+"))
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .map(Integer::parseInt)
                .toList();
    }
}