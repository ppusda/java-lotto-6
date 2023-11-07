package lotto.View;

import System.Message;
import java.util.List;
import lotto.Model.Domain.Lotto;

public class LottoOutput {

    public void printTotalPurchaseAmount(List<Lotto> lottos) {
        System.out.println(lottos.size() + Message.OUTPUT_TOTAL_PURCHASE_AMOUNT.getMessage());
    }

    public void inputWinningNumber() {
        System.out.println(Message.INPUT_WINNING_NUMBER.getMessage());
    }

    public void inputBonusNumber() {
        System.out.println(Message.INPUT_BONUS_NUMBER.getMessage());
    }

}