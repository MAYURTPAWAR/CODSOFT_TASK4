import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CURRENCY CONVERTER");

        // Simulating exchange rates (replace with real API calls in a production environment)
        double usdToEurRate = 0.85;
        double usdToGbpRate = 0.75;

        System.out.println("Select base currency:");
        System.out.println("1. USD (US Dollar)");

        int baseCurrencyChoice = scanner.nextInt();
        double exchangeRate = 1.0; // Default rate for the same currency

        switch (baseCurrencyChoice) {
            case 1:
                System.out.println("Select target currency:");
                System.out.println("2. EUR (Euro)");
                System.out.println("3. GBP (British Pound)");
                int targetCurrencyChoice = scanner.nextInt();

                if (targetCurrencyChoice == 2) {
                    exchangeRate = usdToEurRate;
                } else if (targetCurrencyChoice == 3) {
                    exchangeRate = usdToGbpRate;
                } else {
                    System.out.println("Invalid target currency choice.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid base currency choice.");
                return;
        }

        System.out.print("Enter the amount in the base currency: ");
        double amount = scanner.nextDouble();

        double convertedAmount = convertCurrency(amount, exchangeRate);

        System.out.println("Converted amount: " + convertedAmount + " in the target currency");
    }

    private static double convertCurrency(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }
}
