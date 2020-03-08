import java.util.Scanner;

public class Number46{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("\nEnter an email address to check if it is valid > ");
		String email = scan.next();
		email = email.trim();

		if (email.contains("@")) {
			System.out.println("\nThe email address entered is valid!");
		} else {
			System.out.println("\nThe email address entered is NOT valid...");
		}
	}
}