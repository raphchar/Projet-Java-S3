import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    Item item = new Item("item", 13.0);

    @Test
    void getName() throws Exception{
        assertEquals("item", item.getName());
    }

    @Test
    void getWeight() throws Exception {
        assertEquals(13.0, item.getWeight());
    }


}