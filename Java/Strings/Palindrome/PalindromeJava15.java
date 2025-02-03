import java.util.*;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String word = scanner.next();
            System.out.println(isPalindrome(word) ? "Yes" : "No");
        }
    }

    private static boolean isPalindrome(String word) {
        if (word.isEmpty()) return true;  // Java 15 feature
        return IntStream.range(0, word.length() / 2)
                .allMatch(i -> word.charAt(i) == word.charAt(word.length() - i - 1));
    }
}
