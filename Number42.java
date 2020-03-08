import java.util.Scanner;

public class Number42{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("\nEnter the number of hits for a batter > ");
		int hits = scan.nextInt();

		System.out.print("Enter the number of at-bats of the batter to see if he is All Star ready > ");
		int atBats = scan.nextInt();

		double ratio = (double)atBats/hits;

		if (ratio > 0.300) {
			System.out.println("The player is elligible for the All Star game!");
		} else if (hits < 0 || atBats < 0) {
			System.out.println("It is impossible to calculate that players ratio");
		} else {
			System.out.println("The player is NOT elligible for the All Star game...");
		}



	}
}