package softwaredesign;


import org.junit.Test;
import org.junit.jupiter.api.*;

/**
 * information from official docs: https://junit.org/junit5/docs/5.0.0/api/org/junit/jupiter/api/Test.html
 * https://junit.org/junit5/docs/current/user-guide/
 */
public class TestFixturesTest {

    /**
     * executed only once before all tests in the current test class
     * e.g. to set up the connection to database, file system etc.
     * BeforeAll methods must have a void return type, must not be private, and must be static by default
     */
    @BeforeAll
    public static void setUpAll() {

    }


    /**
     * executed only once after all tests in the current test class
     * e.g. to close the connection to database, file system etc.
     * @AfterAll methods must have a void return type, must not be private, and must be static by default
     */
    @AfterAll
    public static void tearDownAll() {

    }


    /**
     * executed before each @Test method in the current test class
     * e.g. to create class instances needed for each test
     * BeforeEach methods must have a void return type, must not be private, and must not be static
     */
    @BeforeEach
    public void setUpEach() {

    }


    /**
     * executed before each @Test method in the current test class
     * e.g. to delete Files after tests or similar cases
     * BeforeEach methods must have a void return type, must not be private, and must not be static
     */
    @AfterEach
    public void tearDownEach() {

    }

    /**
     * signals test method
     * must not be private or static and must not return a value
     * utilize Assert.assertEquals(expected, actual) and similar statements to test
     */
    @Test
    public void testMethod1() {
        Assertions.assertEquals("Hello", "Hello");
    }



}
