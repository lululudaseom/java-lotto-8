package lotto.controller;

import java.util.List;
import java.util.ArrayList;
import lotto.view.Input;
import lotto.view.Output;
import lotto.model.generateLotto;
import lotto.model.LottoCalculate;

public class Controller {
    public static void run(String[] args) {
        Output.inputAmountGuide(); // 안내
        int money = Input.inputAmount(); // 로또 구입 금액 입력 받기

        int count = LottoCalculate.getLottoCount(money); // 로또 개수 계산

        List<List<Integer>> lottos = generateLotto.generateLottos(count); // 로또 생성
        List<String> lottoStrings = new ArrayList<>();
        for (List<Integer> lotto : lottos) {
            lottoStrings.add(lotto.toString());
        }

        Output.printLottoCount(count, lottoStrings); // 로또 개수와 생성된 로또 출력
    }

}
