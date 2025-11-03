package lotto.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Arrange { // 문자열을 콤마로 나누고 리스트로 변환 + 오름차순 정렬
    // 문자열을 콤마로 나눠서 List<Integer>로 변환
    public static List<Integer> parseNumbers(String input) {
        return Arrays.stream(input.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    // 리스트를 오름차순 정렬
    public static List<Integer> sortNumbers(List<Integer> numbers) {
        Collections.sort(numbers);
        return numbers;
    }

    public static List<Integer> parseAndSort(String input) { //입력 번호 정렬
        List<Integer> numbers = parseNumbers(input);
        return sortNumbers(numbers);
    }
}
