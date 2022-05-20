import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JokeManagerTest {

    @DisplayName("Make sure empty list defaults")
    @Test
    void drawJoke() {
        JokeManager jm = new JokeManager();
        assertEquals("Jokes are in short supply.", jm.drawJoke());
    }
}