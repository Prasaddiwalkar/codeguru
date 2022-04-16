package code.codeguru.interview.greedy;

import org.junit.Before;
import org.junit.Test;

public class ReverseTheIntegerTest {

	ReverseTheInteger reverseInt;

	@Before
	public void setup() {
		reverseInt = new ReverseTheInteger();
	}

	@Test
	public void testReverseInt() {
		System.out.println(reverseInt.reverseInteger(123456));
	}
}
