package code.codeguru.interview.list;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LinkedListTest {

    LinkedList list;

    @BeforeAll
    public void setup() {
        list = new LinkedList();
    }

    @Test
    public void linkedListTest() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.printList();

        list.add(2, 6);
        list.printList();
        list.remove(2);
        list.printList();
    }
}
