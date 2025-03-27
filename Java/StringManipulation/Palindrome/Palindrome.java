package StringManipulation.Palindrome;

public class Palindrome {
    public static boolean isPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        while (start < end) {
            if (cleanedInput.charAt(start) != cleanedInput.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean cleanPalindrome(String input) {
            String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            StringBuilder reversed = new StringBuilder(cleanedInput).reverse();
            return cleanedInput.equals(reversed.toString());
        }
    }
