package lotto.model;

import java.util.ArrayList;
import java.util.List;

public class LottoWinningCount {
    public static List<Integer> winningCount(List<List<Integer>> lottos, List<Integer> winningNumbers, int bonusNumber) {
        List<Integer> matchCounts = LottoMatcher.countMatches(lottos, winningNumbers);
        List<Integer> winningList = new ArrayList<>(List.of(0, 0, 0, 0, 0)); // [3, 4, 5, 5+보너스, 6]

        for (int i = 0; i < lottos.size(); i++) {
            int matchCount = matchCounts.get(i);
            List<Integer> lotto = lottos.get(i);

            getWinningList(winningList, matchCount, lotto, bonusNumber);
        }

        return winningList;
    }

    private static void getWinningList(List<Integer> winningList, int matchCount, List<Integer> lotto, int bonusNumber) {
        if (matchCount == 3) {
            plusCount(winningList, 0); // 3개
            return;
        }

        if (matchCount == 4) {
            plusCount(winningList, 1); // 4개
            return;
        }

        if (matchCount == 5) {
            separateFiveMatches(winningList, lotto, bonusNumber); // 5개 전용 분기
            return;
        }

        if (matchCount == 6) {
            plusCount(winningList, 4); // 6개
        }
    }

    private static void separateFiveMatches(List<Integer> winningList, List<Integer> lotto, int bonusNumber) {
        if (lotto.contains(bonusNumber)) {
            plusCount(winningList, 3); // 5+보너스
            return;
        }
        plusCount(winningList, 2); // 그냥 5개
    }

    private static void plusCount(List<Integer> winningList, int index) {
        winningList.set(index, winningList.get(index) + 1);
    }
}
