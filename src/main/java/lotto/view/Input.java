package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class Input {
    public static int inputAmount() { // 로또 구입 금액 입력
        return Integer.parseInt(Console.readLine());
    }

    public static String inputNumbers() { // 당첨 번호 입력
        return Console.readLine();
    }

    public static int inputBonus() { // 보너스 번호 입력
        return Integer.parseInt(Console.readLine());
    }
}

