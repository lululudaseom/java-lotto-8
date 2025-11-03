package lotto.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Input {
    public static int inputAmount() { // 로또 구입 금액 입력
        return Integer.parseInt(Console.readLine());
    }

    public static int inputNumbers(List<Integer> numbers) { // 당첨 번호 입력
        return Integer.parseInt(Console.readLine());
    }

    public static int inputBonus(List<Integer> numbers) { // 보너스 번호 입력
        return Integer.parseInt(Console.readLine());
    }
}

