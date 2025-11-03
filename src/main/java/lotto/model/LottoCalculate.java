package lotto.model;

import java.util.List;

public class LottoCalculate { // 로또 계산
    private static final int[] PRIZES = {5000, 50000, 1500000, 30000000, 2000000000};

    public static int getLottoCount(int money) {
        return money/1000;
    } // 구매한 로또 개수 반환

    public static double calculateProfit(List<Integer> winningList, int money) {
        long totalPrize = 0;

        for (int i = 0; i < PRIZES.length; i++) {
            totalPrize += (long) winningList.get(i) * PRIZES[i];
        }

        return (double) totalPrize / money * 100;
    } // 수익률 반환
}
