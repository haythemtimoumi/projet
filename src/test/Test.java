import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestTest {

    @Mock
    private DependencyClass dependency;

    private Test testInstance;

    @Before
    public void setUp() {
        // Initialize your class with the mocked dependency
        testInstance = new Test(dependency);
    }

    @Test
    public void testYourMethod() {
        // Arrange
        when(dependency.someMethod()).thenReturn("Expected Value");

        // Act
        String result = testInstance.methodToTest();

        // Assert
        assertEquals("Expected Value", result);
    }
}
