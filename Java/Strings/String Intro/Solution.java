import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try (Scanner scanner = new Scanner(System.in)) {
            String A = scanner.next();
            String B = scanner.next();
            
            System.out.println(A.length() + B.length());
            System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
            System.out.println(Character.toUpperCase(A.charAt(0)) + A.substring(1) + " " +Character.toUpperCase(B.charAt(0)) + B.substring(1));


        }
    }
}
