package code.codeguru.interview.dsalgo.problems.arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MoveElementToEndTest {

    MoveElementToEnd elementToEnd;

    @BeforeAll
    public void setup() {
        elementToEnd = new MoveElementToEnd();
    }

    @Test
    public void moveElementToEnd() {
        elementToEnd.moveElementToEnd(List.of(2, 1, 2, 2, 2, 3, 4, 2), 2);
    }
}
