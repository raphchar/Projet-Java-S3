import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class U1Test {
    U1 u1 = new U1();

    @Test
    void testLand() {
        assertTrue(u1.land());
    }

    @Test
    void testLaunch() {
        assertTrue(u1.launch());
    }
}