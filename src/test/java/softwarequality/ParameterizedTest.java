package softwarequality;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

/**
 * This test class shows the functionality of parameterized tests in JUnit
 */
@RunWith(Parameterized.class)
public class ParameterizedTest {

    /**
     * This function sets up the parameters for the test, first entry in the array is the input the second is the expected outcome
     * The array is then utilized as parameter inputs in the constructor, saved as fields, then both used in assertions
     * @return a List of test "pairs" where the first entry is the input to be tested and the second its expected outcome
     */
    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {-1, -5}, {0, 0}, {1, 5}, {2, 10}, {3,15}, {5,25}
        });
    }

    private int input;
    private int expected;

    public ParameterizedTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void multiplyBy5Test() {
        SuperSimpleCalculator superSimpleCalculatorToBeTested = new SuperSimpleCalculator();
        Assert.assertEquals(expected, superSimpleCalculatorToBeTested.multiplyBy5(input));
    }

}
