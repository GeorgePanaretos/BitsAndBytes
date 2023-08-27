package StringManipulation.Palindrome;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindrome() {
        assertTrue(Palindrome.isPalindrome("level"));
        assertTrue(Palindrome.isPalindrome("Level"));
        assertFalse(Palindrome.isPalindrome("Malakas"));
    }

    @Test
    void Palindrome(){
        assertTrue(Palindrome.cleanPalindrome("Level"));
        assertTrue(Palindrome.cleanPalindrome("A man, a plan, a canal. Panama."));
    }
}