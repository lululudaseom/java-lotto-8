package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class Input {
    public static int inputAmount() {
        String input = Console.readLine();

        if (!input.matches("\\d+")) {
            throw new IllegalArgumentException("[ERROR] 로또 구입 금액은 숫자만 입력해야 합니다.");
        }

        return Integer.parseInt(input);
    }

    public static String inputNumbers() {
        return Console.readLine();
    }

    public static int inputBonus() {
        String input = Console.readLine();
        if (!input.matches("\\d+")) {
            throw new IllegalArgumentException("[ERROR] 보너스 번호는 숫자만 입력해야 합니다.");
        }
        return Integer.parseInt(input);
    }
}

