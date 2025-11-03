package lotto.controller;

import lotto.view.Input;
import lotto.view.Output;
import lotto.model.generateLotto;
import lotto.model.getLottoCount;

public class Controller {
    public static void main(String[] args) {
        Controller controller = new Controller();
        int inputAmount = Input.inputAmount(); // 로또 구입 금액 입력 받기
        controller.outputLottoCount();
        int inputNumbers = Input.inputNumbers(null); // 당첨 번호 입력 받기 (임시로 null)
        int inputBonus = Input.inputBonus(null); // 보너스 번호 입력 받기
    }

    public void outputLottoCount() {
        List<Lotto> lottos = lottoService.generate(); // Lotto 객체 리스트
        List<String> lottoStrings = lottos.stream()
                .map(Lotto::toString)
                .toList();

        Output.printLottoCount(lottos.size(), lottoStrings);
    }
}
