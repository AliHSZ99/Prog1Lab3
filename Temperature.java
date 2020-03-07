import java.util.Scanner;

public class Temperature{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String response;

		System.out.print("\nEnter the current temperature in Celcius > ");
		double celcius = scan.nextDouble();

		response = celcius > 0 ? "The weather is amazing!":"The weather is cold!";

		System.out.println("\n" + response);

	}
}