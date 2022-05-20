import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @DisplayName("Checking if print with no items returns 0")
    @Test
    void price() {
        ShoppingCart cart = new ShoppingCart();
        assertEquals(0, cart.price());
    }
}