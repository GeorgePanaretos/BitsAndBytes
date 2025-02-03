import java.util.*;
import java.text.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double payment = scanner.nextDouble();

            List<Locale> locales = Arrays.asList(
                Locale.US, 
                new Locale("en", "IN"), 
                Locale.CHINA, 
                Locale.FRANCE
            );

            List<String> countryNames = Arrays.asList("US", "India", "China", "France");

            String result = Stream.iterate(0, i -> i + 1)
                    .limit(locales.size())
                    .map(i -> countryNames.get(i) + ": " + formatCurrency(payment, locales.get(i)))
                    .collect(Collectors.joining("\n"));

            System.out.println(result);
        }
    }

    private static String formatCurrency(double amount, Locale locale) {
        return NumberFormat.getCurrencyInstance(locale).format(amount);
    }
}
