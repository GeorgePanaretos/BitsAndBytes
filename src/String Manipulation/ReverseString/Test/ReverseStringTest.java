package Test;

import ReverseString.ReverseString;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseStringTest extends ReverseString {

    @Test
    void testReverseString() {
    }

    @Test
    void testReverseString1() {
    }

    @Test
    void testCleanReverseString() {
         assertEquals("olleH", ReverseString.cleanReverseString("Hello"));
    }
}