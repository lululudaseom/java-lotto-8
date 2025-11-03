package lotto.controller;

import java.util.List;

import lotto.model.Arrange;
import lotto.model.LottoWinningCount;
import lotto.view.Input;
import lotto.view.Output;
import lotto.model.generateLotto;
import lotto.model.LottoCalculate;

public class Controller {
    public static void run(String[] args) {
        Output.inputAmountGuide(); // 구입금액을 입력해 주세요.
        int money = Input.inputAmount(); // 로또 구입 금액 입력 받기

        int count = LottoCalculate.getLottoCount(money); // 로또 개수 계산

        List<List<Integer>> lottos = generateLotto.generateLottos(count); // 로또 생성

        Output.printLottoCount(count, lottos); // 로또 개수와 생성된 로또 출력

        Output.NumberGuide(); // 당첨 번호를 입력해 주세요.
        String inputNumber = Input.inputNumbers(); // 당첨 번호 입력 받기
        List<Integer> winningNumbers = Arrange.parseAndSort(inputNumber); // 정렬

        Output.BonusGuide(); // 보너스 번호를 입력해 주세요.
        int bonusNumber = Input.inputBonus(); //보너스 번호 입력받기

        // 당첨 개수 계산하기
        List<Integer> winningList = LottoWinningCount.winningCount(lottos, winningNumbers, bonusNumber);

        // 수익률 계산하기
        double profit = LottoCalculate.calculateProfit(winningList, money);

        Output.printProfit(winningList, profit);

    }

}
