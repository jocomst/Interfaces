import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomTacoBoxTest {

    @DisplayName("Test tacos remaining")
    @Test
    void tacosRemaining() {
        CustomTacoBox box = new CustomTacoBox(5);
        box.eat();
        box.eat();
        box.eat();
        assertEquals(2, box.tacosRemaining());

    }
}