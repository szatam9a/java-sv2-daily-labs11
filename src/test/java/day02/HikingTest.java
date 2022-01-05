package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @Test
    void getPlusElevationTest() {
        Hiking hiking = new Hiking();

        List<Double> toTest = List.of(10.0, 5.0, 10.0, 15.0);
        assertEquals(10, hiking.getPlusElevation(toTest));
    }
}