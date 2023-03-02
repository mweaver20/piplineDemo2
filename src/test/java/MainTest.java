import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main main;
    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @Test
    void getFullName() {
        main.setFirstName("lisa");
        main.setLastName("simpson");
        assertEquals("LISA SIMPSON", main.getFullName());
    }

    @Test
    void getLastName() {
        main.setLastName("simpson");
        assertEquals("simpson", main.getLastName());
    }

    @Test
    void getFirstName() {
        main.setFirstName("bart");
        assertEquals("bart", main.getFirstName());
    }
}