import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class mainProgramTest {


    @DisplayName("See if map gets returned")
    @Test
    void returnSize() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");

        assertEquals(2, mainProgram.returnSize(list));
    }
}