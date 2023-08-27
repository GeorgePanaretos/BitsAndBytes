package StringManipulation.Palindrome;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindrome() {
        assertTrue(Palindrome.isPalindrome("level"));
//        assertEquals(true, Palindrome.isPalindrome("Level")); lower upper case failure
        assertFalse(Palindrome.isPalindrome("Malakas"));
    }
}