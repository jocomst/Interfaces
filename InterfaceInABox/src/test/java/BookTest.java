import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @DisplayName("See if the weight is returned")
    @org.junit.jupiter.api.Test
    void weight() {
        Book b = new Book("John Steinbeck", "Grapes of Wrath", 10);
        assertEquals(10, b.weight());
    }
}