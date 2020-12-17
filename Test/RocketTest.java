import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class RocketTest {

    @Test
    public void testGetMaxWeight() {
        Rocket rocket = new Rocket(100, 1000, 100000);
        assertEquals(100000, rocket.getMaxWeight());
    }

    @Test
    public void testGetCost() {
        Rocket rocket = new Rocket(100, 1000, 10000);
        assertEquals(100, rocket.getCost());
    }

    @Test
    public void testGetRocketWeight() {
        Rocket rocket = new Rocket(100, 1000, 100000);
        assertEquals(1000, rocket.getRocketWeight());
    }

    @Test
    public void testLaunch(){
        Rocket rocket = new Rocket(100, 1000, 100000);
        assertTrue(rocket.launch());
    }

    @Test
    public void testLand(){
        Rocket rocket = new Rocket(100, 1000, 100000);
        assertTrue(rocket.land());
    }

    @Test
    public void testCanCarryTrue() {
        Rocket rocket = new Rocket(100, 1000, 100000);
        Item item = new Item("Item Test", 10);
        boolean result = rocket.canCarry(item);
        assertTrue(result);
    }

    @Test
    public void testCanCarryFalse() {
        Rocket rocket = new Rocket(100, 1000, 100000);
        Item item = new Item("Item Test", 100000);
        boolean result = rocket.canCarry(item);
        assertFalse(result);
    }

    @Test
    public void testCarry(){
        Rocket rocket = new Rocket(100, 1000, 100000);
        Item item = new Item("Item Test", 10);
        Item item1 = new Item("Item Test1", 20);
        rocket.carry(item);
        rocket.carry(item1);
        assertEquals(2, rocket.items.size());
    }

    @Test
    public void testGetCargoWeight(){
        Rocket rocket = new Rocket(100, 1000, 100000);
        Item item = new Item("Item Test", 10);
        Item item1 = new Item("Item Test1", 20);
        rocket.carry(item);
        rocket.carry(item1);
        assertEquals(30, rocket.getCargoWeight());
    }

}