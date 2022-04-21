package code.equinix.interview;

import org.junit.Before;
import org.junit.Test;

public class AssessmentTest {

    Assessment assesement;

    @Before
    public void setup() {
        assesement = new Assessment();
    }

    @Test
    public void testAssessement() {
        assesement.execute();
    }
}
