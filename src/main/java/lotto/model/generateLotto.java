package lotto.model;

import java.util.List;
import java.util.ArrayList;
import camp.nextstep.edu.missionutils.Randoms;

public class generateLotto {
    public static List<List<Integer>> generateLottos(int count) {
        List<List<Integer>> lottos = new ArrayList<>();

        // count번 반복하면서 로또 한 장씩 생성
        for (int i = 0; i < count; i++) {
            List<Integer> lotto = Randoms.pickUniqueNumbersInRange(1, 45, 6);
            lottos.add(lotto);
        }

        return lottos;
    }
}
