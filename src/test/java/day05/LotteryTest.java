package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @Test
    void startLotteryTest() {
        Lottery lottery = new Lottery(10, 5);
        System.out.println(lottery.startLottery());
    }

    @Test
    void dontStartLotteryTest() {
        Lottery lottery = new Lottery(4, 5);
        assertThrowsExactly(IllegalArgumentException.class, () ->
                lottery.startLottery());
    }
}