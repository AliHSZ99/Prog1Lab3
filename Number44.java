public class Number44{
	public static void main(String[] args){

		final double THRESHOLD = .0001;

		double squareArea = Math.pow(0.666666667, 2);
		double rectangleArea = (1/9.0) * 4.0;

		if (Math.abs(squareArea-rectangleArea) < THRESHOLD) {
			System.out.println("\nThe area of a square of side 0.66666667 and the area of " +
		 						"\na rectangle of side 1/9 and 4 are equal because of a threshold value given.");				
		} else {
			System.out.println("\nThe are of a square of side 0.666667 and the area of a rectangle "
								+ "\nof side 1/9 and 4 are NOT equal...");				
		}
	}
}