package lotto.model;

import java.util.ArrayList;
import java.util.List;

public class LottoMatcher {
    public static List<Integer> countMatches(List<List<Integer>> lottos, List<Integer> winningNumbers) {
        List<Integer> matchCounts = new ArrayList<>();

        for (List<Integer> lotto : lottos) {
            long count = lotto.stream()
                    .filter(winningNumbers::contains) // 당첨 번호 포함된 것만 남김
                    .count();                         // 개수 세기
            matchCounts.add((int) count);
        }

        return matchCounts;
    }
}
