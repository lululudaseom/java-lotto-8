package lotto.controller;

import java.util.List;

import lotto.model.Arrange;
import lotto.model.LottoWinningCount;
import lotto.view.Input;
import lotto.view.Output;
import lotto.model.LottoException;
import lotto.model.generateLotto;
import lotto.model.LottoCalculate;

public class Controller {
    public static void run() {
        try {
            int money = getMoney();
            int count = LottoCalculate.getLottoCount(money);
            List<List<Integer>> lottos = generateLottoList(count);

            List<Integer> winningNumbers = getWinningNumbers();
            int bonusNumber = getBonusNumber(winningNumbers);

            printResult(lottos, winningNumbers, bonusNumber, money);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // 금액 입력
    private static int getMoney() {
        Output.inputAmountGuide();
        int money = Input.inputAmount();
        LottoException.validateMoney(String.valueOf(money)); // static 메서드로 검증
        return money;
    }

    // 로또 자동 생성
    private static List<List<Integer>> generateLottoList(int count) {
        List<List<Integer>> lottos = generateLotto.generateLottos(count);
        Output.printLottoCount(count, lottos);
        return lottos;
    }

    // 당첨 번호 입력
    private static List<Integer> getWinningNumbers() {
        Output.NumberGuide();
        String inputNumber = Input.inputNumbers();
        LottoException.validateWinningNumbers(inputNumber); // static 메서드로 검증
        return Arrange.parseAndSort(inputNumber);
    }

    // 보너스 번호 입력
    private static int getBonusNumber(List<Integer> winningNumbers) {
        Output.BonusGuide();
        int bonus = Input.inputBonus();
        LottoException.validateBonusNumber(String.valueOf(bonus), winningNumbers); // static 메서드로 검증
        return bonus;
    }

    // 결과 출력
    private static void printResult(List<List<Integer>> lottos,
                                    List<Integer> winningNumbers,
                                    int bonusNumber,
                                    int money) {
        List<Integer> winningList =
                LottoWinningCount.winningCount(lottos, winningNumbers, bonusNumber);
        double profit = LottoCalculate.calculateProfit(winningList, money);
        Output.printProfit(winningList, profit);
    }
}
