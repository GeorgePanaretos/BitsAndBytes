package StringManipulation.PalindromeDeletionValidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeDeletionValidatorTest {

    @Test
    void canFormPalindrome() {
        assertTrue(PalindromeDeletionValidator.canFormPalindrome("abcba"));
        assertTrue(PalindromeDeletionValidator.canFormPalindrome("foobof"));
    }

    @Test
    void falseFormPalindrome() {
        assertFalse(PalindromeDeletionValidator.canFormPalindrome("abccab"));
    }
}