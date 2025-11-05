package code.codeguru.interview.algoexpert.problems.arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ArrayOfProductsTest {

    ArrayOfProducts arrayOfProducts;

    @BeforeAll
    public void setup() {
        arrayOfProducts = new ArrayOfProducts();
    }

    @Test
    public void arrayOfProductsTest() {
        int[] array = {5, 1, 4, 2};
        arrayOfProducts.arrayOfProducts2(array);

        arrayOfProducts.arrayOfProducts1(array);
    }
}
