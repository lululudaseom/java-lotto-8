package lotto.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Arrange { // 문자열을 콤마로 나누고 리스트로 변환 + 오름차순 정렬
    public static List<Integer> arrangeNumbers(String input) {
        List<Integer> numbers = Arrays.stream(input.split(","))
                .map(String::trim)          // 공백 제거
                .map(Integer::parseInt)     // 문자열 → int
                .collect(Collectors.toList());

        Collections.sort(numbers);          // 오름차순 정렬
        return numbers;
    }
}
