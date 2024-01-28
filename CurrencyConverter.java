import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base currency
        System.out.print("Enter base currency: ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        // Input target currency
        System.out.print("Enter target currency: ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        // Fetch exchange rates from a reliable API (Not implemented here)

        // Input amount
        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        // Currency conversion logic (Not implemented here)

        // Assuming a fixed conversion rate for demonstration
        double conversionRate = 1.23; // Example conversion rate

        // Calculate converted amount
        double convertedAmount = amount * conversionRate;

        // Display result
        System.out.printf("%.2f %s = %.2f %s%n", amount, baseCurrency, convertedAmount, targetCurrency);

        scanner.close();
    }
}

