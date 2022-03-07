package softwarequality.mockito;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import softwarequality.ExemplaryDatabaseForMockitoTesting;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.*;

/**
 * docs: https://javadoc.io/doc/org.mockito/mockito-core/latest/org/mockito/Mockito.html
 */
public class MockitoTest {

    @Mock
    List<String> listMock = mock(LinkedList.class);
    ExemplaryDatabaseForMockitoTesting mockedDataBaseClass = mock(ExemplaryDatabaseForMockitoTesting.class);

    @Test
    //simple test
    public void listMockTest() {
        //define return value
        when(listMock.get(0)).thenReturn("Test String");
        //use mock object with the above defined behaviour to test
        Assert.assertTrue("test string".equalsIgnoreCase(listMock.get(0)));
    }

    @Test
    //this test utilizes parameters
    public void exemplaryDataBaseTest() {
        String predefinedQuery = "Search for a user's name given ID";
        //define return value
        when(mockedDataBaseClass.queryDataBase(predefinedQuery)).thenReturn("John Doe");

        //use mock object with the above defined behaviour to test
        Assert.assertEquals("John Doe", mockedDataBaseClass.queryDataBase(predefinedQuery));

        //test without pre-defined case and without the mock object, this shows that the mock object overrides the return to "null" for non-defined cases,
        //despite the method here usually returning the String: "Standard database result"
        Assert.assertNull(mockedDataBaseClass.queryDataBase("Any other String"));
        ExemplaryDatabaseForMockitoTesting exemplaryClass = new ExemplaryDatabaseForMockitoTesting();
        Assert.assertEquals("Standard database result", exemplaryClass.queryDataBase("Any String"));

        //test that the queryDataBase() method of the mocked object has been called
        verify(mockedDataBaseClass).queryDataBase(predefinedQuery);
    }


}
