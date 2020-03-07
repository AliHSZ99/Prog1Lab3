import java.util.Scanner;
import java.text.DecimalFormat;

public class Conversions{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter (1) to convert meters to feet" + 
						 	"\nEnter (2) to convert CAD to USD" +
						 	"\nEnter (3) to convert Celsius to Fahrenheit" +
						 	"\nEnter (4) to convert Celsius to Kelvin" +
						 	"\nEnter (5) to convert CAD to EUR");
		int response = scan.nextInt();

		switch (response) {
			case 1:
				DecimalFormat formatLength = new DecimalFormat("0.00");
				System.out.println("\n**** Converting Meters to Feet ****");

				System.out.print("\nEnter the number of meter that you want to convert to feet > ");
				double meters = scan.nextDouble();

				if (meters < 0) {
					System.out.println("it is impossible to have a negative length");
				} else {
					System.out.println(meters + " meters in feet is " + meters*3.281);
				}
				break;

			case 2: 
				DecimalFormat formatMoney = new DecimalFormat("$0.00");
				System.out.println("\n**** Converting CAD to USD ****");

				System.out.print("\nEnter the amount in CAD you want to convert to USD > ");
				double usd = scan.nextDouble();

				if (usd < 0) {
					System.out.println("Money cannot be negative");
				} else {
					System.out.println(formatMoney.format(usd) + " to USD is " + 
										formatMoney.format(usd*0.74));
				}
				break;

			case 3: 
				System.out.println("\n**** Converting Celsius to Fahrenheit ****");

				System.out.print("\nEnter the temperature in Celsius that you want to convert to Fahrenheit > ");
				double fahrenheit = scan.nextDouble();

				System.out.println("\n" + fahrenheit + " in fahrenheit is " + 
									((fahrenheit*(9.0/5)) + 32.0));
				break;

			case 4: 
				System.out.print("\n**** Converting Celsius to Kelvin ****");

				System.out.print("\nEnter the temperature in Celsius that you want to convert to Kelvin > ");
				double kelvin = scan.nextDouble();

				System.out.println("\n" + kelvin + " in kelvin is " + (kelvin+270));
				break;

			case 5: 
				DecimalFormat formatEur = new DecimalFormat("$0.00");
				System.out.println("\n**** Converting CAD to EUR ****");

				System.out.print("\nEnter the amount in CAD that you want to convert to EUR > ");
				double eur = scan.nextDouble();

				if (eur < 0) {
					System.out.println("\nMoney cannot be nagative");
				} else {
					System.out.println("\n" + formatEur.format(eur) + " in EUR is " +
										formatEur.format(eur*0.66));
				}
				default:
					System.out.println("\nUnrecognized option!");
					
			
		}


	}
}