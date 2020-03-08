import java.util.Scanner;

public class Number50{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("\nEnter the temperature(Fahrenheit) as a whole Number to find out to what season it corresponds > ");
		int temperature = scan.nextInt();

		if (temperature > 110 || temperature < -5) {
			System.out.println("The temperature entered is outside the valid range...");
		} else if (temperature >= 90) {
			System.out.println("It is probably summer");
		} else if (temperature >= 70 && temperature < 90) {
			System.out.println("It is probably spring");
		} else if (temperature >= 50 && temperature < 70) {
			System.out.println("It is probably fall");
		} else if (temperature < 50) {
			System.out.println("It is probably winter");
		}

	}
}