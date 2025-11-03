package lotto.model;

public class LottoCalculate { // 로또 계산
    public static int getLottoCount(int money) {
        return money/1000;
    } // 구매한 로또 개수 반환

    public static int calculateProfit(int profit, int count) {
        return profit / (count * 1000);
    } // 수익률 반환
}
