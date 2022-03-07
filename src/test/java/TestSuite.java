import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import softwaredesign.TestFixturesTest;
import softwaredesign.code_coverage.CodeCoverageTest;
import softwarequality.ReflectionTest;
import softwarequality.ParameterizedTest;
import softwarequality.mockito.MockitoTest;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                TestFixturesTest.class, CodeCoverageTest.class, MockitoTest.class,
                ParameterizedTest.class, ReflectionTest.class,
                ListIteratorTest.class
        })
public class TestSuite {

}

