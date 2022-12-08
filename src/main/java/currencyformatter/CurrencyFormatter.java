package currencyformatter;/*
 *
 * @author Lawshiga
 *
 */

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        // since India has no Locale, we need to create one using its constructor
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        String canada = NumberFormat.getCurrencyInstance(Locale.CANADA).format(payment);
        String srilanka = NumberFormat.getCurrencyInstance(new Locale("en", "lk")).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("France: " + france);
        System.out.println("Canada: " + canada);
        System.out.println("Sri Lanka: " + srilanka);
    }
}
