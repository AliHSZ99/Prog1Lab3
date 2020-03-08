import java.util.Scanner;

public class Number51{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the year > ");
		String year = scan.next().trim();

		if (year.length() == 2) {
			int yearInt = Integer.parseInt(year);

			System.out.println("The year is " + (yearInt + 2000));
		} else if (year.length() == 4) {
			int yearInt = Integer.parseInt(year);

			System.out.println("The year is " + yearInt);
		} else {
			System.out.println("The year entered is not valid...");
		}
	}
}