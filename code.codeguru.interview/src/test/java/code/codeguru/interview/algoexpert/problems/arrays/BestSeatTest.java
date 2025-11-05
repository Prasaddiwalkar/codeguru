package code.codeguru.interview.algoexpert.problems.arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BestSeatTest {

    BestSeat seat;

    @BeforeAll
    public void setup() {
        seat = new BestSeat();
    }

    @Test
    public void bestSeatTest() {}
}
