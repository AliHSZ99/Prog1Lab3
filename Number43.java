import java.util.Scanner;

public class Number43{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("\nEnter a character to check if it is a valid character to start an identifier > ");
		char character = scan.next().charAt(0);

		boolean answer = Character.isJavaIdentifierStart(character);

		System.out.println("\nis the character entered a valid character to start an identifier? " + answer);
	}
}