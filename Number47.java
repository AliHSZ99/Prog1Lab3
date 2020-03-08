import java.util.Scanner;

public class Number47{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("\nCreate and enter your new Password > ");
		String password = scan.nextLine().trim();

		System.out.print("\nEnter the Password once more for confirmation > ");
		String password2 = scan.nextLine().trim();

		if (password.equals(password2)) {
			System.out.println("\nYou are now registered as a new user");
		} else {
			System.out.println("\nSorry, there is a typo in your password");
		}

	}
}