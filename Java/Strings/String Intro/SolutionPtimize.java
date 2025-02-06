import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String A = scanner.next();
            String B = scanner.next();

            // Print sum of lengths
            System.out.println(A.length() + B.length());

            // Lexicographical comparison
            System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

            // Capitalize first letter and print
            System.out.printf("%s %s%n", capitalize(A), capitalize(B));
        }
    }

    private static String capitalize(String str) {
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}
