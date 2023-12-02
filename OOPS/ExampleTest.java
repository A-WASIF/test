import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleTest {
    private String greeting;

    @Before
    public void setUp() {
        // This method is annotated with @Before and runs before each test method.
        // You can perform setup tasks here, like initializing variables or resources.
        greeting = "Hello, World!";
    }

    @Test
    public void testGreetingNotNull() {
        // This is a test method.
        assertNotNull(greeting);
    }

    @Test
    public void testGreetingContent() {
        // Another test method.
        assertEquals("Hello, World!", greeting);
    }
}
