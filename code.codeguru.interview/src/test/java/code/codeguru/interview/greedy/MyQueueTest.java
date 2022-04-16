package code.codeguru.interview.greedy;

import org.junit.Before;
import org.junit.Test;

import code.codeguru.interview.stack.MyQueue;

public class MyQueueTest {

	MyQueue queue;

	@Before
	public void setup() {
		queue = new MyQueue();
	}

	@Test
	public void testMyQueue() {

		queue.add(3);
		queue.add(4);
		queue.add(5);
	}
}
