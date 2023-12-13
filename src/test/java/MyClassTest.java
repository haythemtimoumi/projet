import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MyClassTest {

    @Mock
    private DependencyClass dependency;

    private MyClass myClassInstance;

    @Before
    public void setUp() {
        // Initialize MyClass with the mocked DependencyClass
        myClassInstance = new MyClass(dependency);
    }

    @Test
    public void testSomeMethodToTest() {
        // Arrange
        when(dependency.someMethod()).thenReturn("Expected Value");

        // Act
        String result = myClassInstance.someMethodToTest();

        // Assert
        assertEquals("Expected Value", result);
    }
}
