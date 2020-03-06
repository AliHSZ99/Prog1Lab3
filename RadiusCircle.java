import java.util.Scanner;

public class RadiusCircle{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the radius of the circle that you want to find the area of > ");
		double radius = scan.nextDouble();

		if (radius <= 0) {
			System.out.println("\nYour radius should be greater than 0");
		}else{
			System.out.println("\nThe area of the circle is " + Math.PI*Math.pow(radius, 2));
		}

		
	}
}