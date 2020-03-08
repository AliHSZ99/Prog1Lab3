import java.util.Scanner;

public class Number48{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("\nEnter your user ID > ");
		String id = scan.next().trim();

		int idLength = id.length();

		if (idLength >= 6 && idLength <= 10) {
			System.out.println("Welcome, barbara");
		} else {
			System.out.println("Sorry, user ID invalid");
		}
	}
}