package StringManipulation.ReverseString;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @org.junit.jupiter.api.Test
    void reverseString() {
        assertEquals("olleH", ReverseString.reverseString("Hello"));
    }

    @Test
    void testCleanReverseString() {
        assertEquals("olleH", ReverseString.cleanReverseString("Hello"));
        assertEquals("tac", ReverseString.cleanReverseString("cat"));
    }
}