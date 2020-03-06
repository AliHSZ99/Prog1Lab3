import java.util.Scanner;

public class BodyMassIndex{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);

		System.out.print("\nEnter your weight in pounds> ");
		double weight = scan.nextDouble();
		System.out.println("your weight in pounds is " + weight);

		System.out.print("\nEnter your height in feet > ");
		double height = scan.nextDouble();
		System.out.println("Your height in feet is " + height);

		weight = weight*0.453592;
		height = height*0.3048;

		double bmi = weight / (Math.pow(height, 2));

		if (weight <= 0 || height <= 0) {
			System.out.println("\nIt is impossible to calculate your BMI.");
		} else if (bmi < 18.5) {
			System.out.println("\nYou are currently Underweight.");
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("You are currently at Normal weight.");
		} else if (bmi > 24.9 && bmi <= 29.9) {
			System.out.println("\nYou are currently Overweight.");
		} else {
			System.out.println("\nYou are currently classified as Obese.");
		}
		

		
	}
}