import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 *
 */
public class ListIteratorTest extends IteratorInterfaceAndInheritanceTest<Integer> {
    @Override
    protected Iterator<Integer> makeNoMoreElementsIterator() {
        List<Integer> empty = new ArrayList<>();
        return empty.iterator();
    }

    @Test
    public void testSomethingSpecific() {
        Assert.assertEquals(1,1);
    }


}
