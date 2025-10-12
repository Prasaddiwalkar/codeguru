package code.codeguru.interview.greedy;

import code.codeguru.interview.stack.MyQueue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MyQueueTest {

    MyQueue queue;

    @BeforeAll
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
