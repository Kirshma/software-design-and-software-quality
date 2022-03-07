import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertFalse;

/**
 * This test class as well as its child classes show how one can handle the testing of interfaces
 * Here the abstract test simply tests the public interface functions
 * In another test-class an instance of a concrete interface implementation is tested which inherits from this class
 */
public abstract class IteratorInterfaceAndInheritanceTest<E> {

    Iterator<E> noMoreElementsIterator;
    protected abstract Iterator<E> makeNoMoreElementsIterator();

    @Before
    public void setUp() {
        noMoreElementsIterator = makeNoMoreElementsIterator();
    }

    @Test
    public void hasNextNoMoreElements() {
        assertFalse(noMoreElementsIterator.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void nextNoMoreElements() {
        noMoreElementsIterator.next();
    }

    @Test(expected = IllegalStateException.class)
    public void removeNoMoreElements() {
        noMoreElementsIterator.remove();
    }

}
