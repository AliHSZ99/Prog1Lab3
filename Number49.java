import java.util.Scanner;

public class Number49{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("\nEnter any web address > ");
		String web = scan.nextLine().trim();

		if (web.endsWith("gov")) {
			System.out.println("This is a government web address");
		} else if (web.endsWith("edu")) {
			System.out.println("This is a university web address");
		} else if (web.endsWith("com")) {
			System.out.println("This is a business web address");
		} else if (web.endsWith("org")) {
			System.out.println("This is an organization web address");
		} else {
			System.out.println("This is a web address from another entity...");
		}
	}
}