import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.example.Main;


public class MainTest {
    @Test
    public void testMethod() {
        Main main = new Main();
        assertEquals(3, main.a());
        System.out.println("Test 1");
    }

    @Test
    public void testMethod2() {
        Main main = new Main();
        assertNotEquals(0, main.a());
        System.out.println("Test 2");
    }
}
