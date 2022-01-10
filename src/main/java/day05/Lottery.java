package day05;

import java.util.LinkedList;
import java.util.List;

public class Lottery {
    private int from;
    private int times;

    public Lottery(int from, int times) {
        this.from = from;
        this.times = times;
    }

    public List<Integer> startLottery() {
        if (from < times) {
            throw new IllegalArgumentException("cant do it");
        }
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < times; ) {
            int roll = (int) ((Math.random() * from) + 1);
            if (!result.contains(roll)) {
                result.add(roll);
                i++;
            }
        }
        return result;
    }
}
