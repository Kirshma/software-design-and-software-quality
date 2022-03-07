package softwarequality;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * This test class shows how one can utilize java reflect/reflection to access and test private or protected methods
 */
public class ReflectionTest {

    @Test
    public void simpleTest() {
        SuperSimpleCalculator superSimpleCalculator = new SuperSimpleCalculator();
        Method method;
        try {
            //private method in superSimpleCalculator called "times100" is set accessible, invoked and its return value then asserted with JUnit
            method = SuperSimpleCalculator.class.getDeclaredMethod("times100", int.class);
            method.setAccessible(true);
            int actual = (int) method.invoke(superSimpleCalculator, 1 );
            Assert.assertEquals(100, actual);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }

}
