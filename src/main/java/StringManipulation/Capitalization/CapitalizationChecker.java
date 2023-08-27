package StringManipulation.Capitalization;

public class CapitalizationChecker {
    public static boolean checkCapitalization(String s) {
        if (s.equals(s.toUpperCase())) {
            return true;
        }
        if (s.equals(s.toLowerCase())) {
            return true;
        }
        if (Character.isUpperCase(s.charAt(0)) && s.substring(1).equals(s.substring(1).toLowerCase())) {
            return true;
        }
        return false;
    }
}
