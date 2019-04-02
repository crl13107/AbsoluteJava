package chapter2_ConsoleInputAndOutput;

import java.text.NumberFormat;
import java.time.chrono.JapaneseChronology;
import java.util.Locale; //only if you aren't using default location
import java.text.DecimalFormat; //the name is pretty self explanatory there..

@SuppressWarnings("unused")
public class Formatting {

	public static void main(String[] args) {

		System.out.println("printf shows overall spaces, followed by after decimal. %6.2f, 2.32 print:");
		System.out.printf("%6.2f %n", 2.32);
		System.out.println("the same thing can be used with fd, e, g, s, c");
		System.out.println("java is right justified, you can add a - after % to make it left justified");
		System.out.printf("%-6.2f. %n", 2.32);
		System.out.println("This format style is going out of date as more people prefer numberformat");
		System.out.println(
				"this type of print was intorduced to make it easier to convert C to java code to reduce cost of fixing legacy code");

		System.out.println("\nMoney Formatter is used for currency");
		System.out.println("Local uses a set location, otherwise it will use the default one");
		NumberFormat usFormat = NumberFormat.getCurrencyInstance();
		NumberFormat japanCurrency = NumberFormat.getNumberInstance(Locale.FRANCE);

		double moneyAmount = 20.23233; // number used

		System.out.println(usFormat.format(moneyAmount)); // gets a method called format from NumberFormat Class

		System.out.println(japanCurrency.format(moneyAmount));

		System.out.println("\nDecimal Format Class");
		System.out.println("Used to format into certain numbers with decimals as a string!!");
		System.out.println("0 is required number; # is optional one.");

		DecimalFormat newCurrencyFormat = new DecimalFormat("000.000######");
		System.out.println(newCurrencyFormat.format(moneyAmount));
		System.out.println("mantissa is the decimal number before the E used for scientific notation");
		
		
	}
}
