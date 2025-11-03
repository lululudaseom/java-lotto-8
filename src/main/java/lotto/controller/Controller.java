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

    private static int getMoney() {
        Output.inputAmountGuide();
        String input = Input.inputAmount();
        LottoException.validateMoney(input);
        return Integer.parseInt(input);
    }

    private static List<List<Integer>> generateLottoList(int count) {
        List<List<Integer>> lottos = generateLotto.generateLottos(count);
        Output.printLottoCount(count, lottos);
        return lottos;
    }

    private static List<Integer> getWinningNumbers() {
        Output.NumberGuide();
        String inputNumber = Input.inputNumbers();
        LottoException.validateWinningNumbers(inputNumber);
        return Arrange.parseAndSort(inputNumber);
    }

    private static int getBonusNumber(List<Integer> winningNumbers) {
        Output.BonusGuide();
        String input = Input.inputBonus();
        LottoException.validateBonusNumber(input, winningNumbers);
        return Integer.parseInt(input);
    }

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
