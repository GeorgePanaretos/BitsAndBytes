package StringManipulation.Capitalization;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CapitalizationCheckerTest {
    @Test
    void checkCapitalization() {
        assertTrue(CapitalizationChecker.checkCapitalization("USA"));
        assertTrue(CapitalizationChecker.checkCapitalization("Calvin"));
        assertTrue(CapitalizationChecker.checkCapitalization("coding"));
    }

    @Test
    void checkFalseCapitalization() {
        assertFalse(CapitalizationChecker.checkCapitalization("compUter"));
    }
}
