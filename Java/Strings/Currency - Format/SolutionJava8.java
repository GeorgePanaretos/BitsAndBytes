import java.util.*;
import java.text.*;

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double payment = scanner.nextDouble();
            
            Map<String, Locale> locales = new LinkedHashMap<>();
            locales.put("US", Locale.US);
            locales.put("India", new Locale("en", "IN"));
            locales.put("China", Locale.CHINA);
            locales.put("France", Locale.FRANCE);

            locales.forEach((country, locale) ->
                System.out.println(country + ": " + formatCurrency(payment, locale))
            );
        }
    }

    private static String formatCurrency(double amount, Locale locale) {
        return NumberFormat.getCurrencyInstance(locale).format(amount);
    }
}
