package lotto.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoException {
    // 금액 검증
    public static void validateMoney(String input) {
        if (!input.matches("\\d+")) {
            throw new IllegalArgumentException("[ERROR] 로또 구입 금액은 숫자만 입력해야 합니다.");
        }

        int money = Integer.parseInt(input);
        if (money % 1000 != 0) {
            throw new IllegalArgumentException("[ERROR] 로또 구입 금액은 1000원 단위여야 합니다.");
        }

        if (money < 1000) {
            throw new IllegalArgumentException("[ERROR] 최소 1000원 이상 입력해야 합니다.");
        }
    }

    // 당첨 번호 검증
    public static void validateWinningNumbers(String input) {
        if (!input.matches("[0-9,\\s]+")) {
            throw new IllegalArgumentException("[ERROR] 숫자와 쉼표, 공백만 입력할 수 있습니다.");
        }

        String[] parts = input.split(",\\s*");
        if (parts.length != 6) {
            throw new IllegalArgumentException("[ERROR] 당첨 번호는 정확히 6개여야 합니다.");
        }

        Set<Integer> unique = new HashSet<>();
        for (String s : parts) {
            int num = Integer.parseInt(s);
            if (num < 1 || num > 45) {
                throw new IllegalArgumentException("[ERROR] 로또 번호는 1에서 45 사이여야 합니다.");
            }
            if (!unique.add(num)) {
                throw new IllegalArgumentException("[ERROR] 중복된 숫자가 있습니다.");
            }
        }
    }

    // 보너스 번호 검증
    public static void validateBonusNumber(String input, List<Integer> winningNumbers) {
        if (!input.matches("\\d+")) {
            throw new IllegalArgumentException("[ERROR] 보너스 번호는 숫자만 입력해야 합니다.");
        }

        int bonus = Integer.parseInt(input);
        if (bonus < 1 || bonus > 45) {
            throw new IllegalArgumentException("[ERROR] 보너스 번호는 1에서 45 사이여야 합니다.");
        }

        if (winningNumbers.contains(bonus)) {
            throw new IllegalArgumentException("[ERROR] 보너스 번호는 당첨 번호와 중복될 수 없습니다.");
        }
    }
}
