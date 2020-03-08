import java.util.*;

public class Number45{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter any sentence > ");
		String sentence = scan.nextLine();
		sentence = sentence.trim();

		if (sentence.endsWith(".")) {
			System.out.println("\nYour sentence is declarative!");
		} else if (sentence.endsWith("!")) {
			System.out.println("\nYour sentence is exclamatory!");
		} else if (sentence.endsWith("?")) {
			System.out.println("\nYour sentence is interrogative!");
		} else {
			System.out.println("\nYour sentence is neither declarative, exclamatory or interrogative...");
		}
	}
}