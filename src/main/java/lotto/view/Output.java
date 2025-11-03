package lotto.view;

import java.util.List; //대체할 수 있는 것 찾아보기


public class Output {
    public static void inputAmountGuide() {
        System.out.println("구입금액을 입력해 주세요.");
    }

    public static void printLottoCount(int count, List<List<Integer>> lottos) {
        System.out.println(count + "개를 구매했습니다.");
        for (List<Integer> lotto : lottos) {
            System.out.println(lotto);
        }
    }

    public static void NumberGuide() {
        System.out.println("당첨 번호를 입력해 주세요.");
    }

    public static void BonusGuide() {
        System.out.println("보너스 번호를 입력해 주세요.");
    }

    public static void printProfit(List<Integer> winningList, double profit) {
        System.out.println("당첨통계\n---");
        System.out.println("3개 일치 (5,000원) - " + winningList.get(0) +"개");
        System.out.println("4개 일치 (50,000원) - " + winningList.get(1) +"개");
        System.out.println("5개 일치 (1,500,000원) - " + winningList.get(2) +"개");
        System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - " + winningList.get(3) +"개");
        System.out.println("6개 일치 (2,000,000,000원) - " + winningList.get(4) +"개");
        System.out.println("총 수익률은" + profit + "%입니다.");
    }
}
