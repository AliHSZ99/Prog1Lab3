import java.util.Scanner;

public class Number52{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("\nEnter the user ID > ");
		String id = scan.next().trim();

		System.out.print("\nEnter the password > ");
		String pass = scan.next().trim();

		if (id.equals("admin") && pass.equals("open")) {
			System.out.println("Welcome.");
		} else if (id.equals("admin") && !pass.equals("open")) {
			System.out.println("Wrong password.");
		} else if (!id.equals("admins") && pass.equals("open")) {
			System.out.println("Wrong user ID.");
		} else {
			System.out.println("Sorry, wrong ID and password.");
		}
	}
}