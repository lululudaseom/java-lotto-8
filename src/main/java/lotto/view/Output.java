package lotto.view;

import java.sql.SQLOutput;

public class Output {
    public static void inputAmountGuide() {
        System.out.println("구입금액을 입력해 주세요.");
    }

    public static void printLottoCount() {
        System.out.println(getLottoCount + "개를 구매했습니다.");
        System.out.print(getLottoList);
    }

    public static void inputBonusGuide() {
        System.out.println("보너스 번호를 입력해 주세요.");
    }

    public static void getProfit() {
        System.out.println("당첨통계\n---");
        System.out.println("3개 일치 (5,000원) - " + 수정해라 +"개");
        System.out.println("4개 일치 (50,000원) - " + 수정 +"개");
        System.out.println("5개 일치 (1,500,000원) - " + 수정 +"개");
        System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - " + 수정 +"개");
        System.out.println("6개 일치 (2,000,000,000원) - " + 수정 +"개");
        System.out.println("총 수익률은" + 수정해라 + "%입니다.");
    }

}
