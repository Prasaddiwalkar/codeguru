package code.codeguru.interview.greedy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ReverseTheIntegerTest {

    ReverseTheInteger reverseInt;

    @BeforeAll
    public void setup() {
        reverseInt = new ReverseTheInteger();
    }

    @Test
    public void testReverseInt() {
        System.out.println(reverseInt.reverseInteger(123456));
    }
}
