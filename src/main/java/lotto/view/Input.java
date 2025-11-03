package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class Input {
    public static int inputAmount() {
        System.out.print("구입금액을 입력해주세요");
        return Integer.parseInt(Console.readLine());
    }
}

