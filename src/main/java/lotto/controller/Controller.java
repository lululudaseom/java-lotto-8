package lotto.controller;

import java.util.List;
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

        Output.inputNumberGuide(); // 당첨 번호를 입력해 주세요.
        String inputNumber = Input.inputNumbers(); // 당첨 번호 입력 받기

        Output.inputBonusGuide(); // 보너스 번호를 입력해 주세요.
        int Bonus = Input.inputBonus(); //보너스 번호 입력받기

    }

}
