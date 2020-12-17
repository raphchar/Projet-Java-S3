import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class RocketTest {

    Rocket rocket = new Rocket(100, 1000, 100000);

    @Test
    public void testCanCarryTrue() {
        Item item = new Item("Item Test", 10);
        boolean result = rocket.canCarry(item);
        assertTrue(result);
    }

    @Test
    public void testCanCarryFalse() {
        Item item = new Item("Item Test", 100000);
        boolean result = rocket.canCarry(item);
        assertFalse(result);
    }

}