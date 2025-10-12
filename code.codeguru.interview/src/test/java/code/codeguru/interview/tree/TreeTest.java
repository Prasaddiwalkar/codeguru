package code.codeguru.interview.tree;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TreeTest {

    Tree tree;

    @BeforeAll
    public void setup() {
        tree = new Tree();
    }

    @Test
    public void test() {
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);
        tree.add(12);
        tree.add(18);

        System.out.println(tree.length());

        System.out.println(tree.height());
    }
}
