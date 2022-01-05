package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @Test
    void getPlusElevationTest() {
        Hiking hiking = new Hiking();
        Double[] test = {10.0,5.0,10.0,15.0};
        List<Double> toTest = Arrays.asList(test);
        assertEquals(10,hiking.getPlusElevation(toTest));
    }
}