import java.util.*;

public class Birthday{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("\nEnter your date of birth in the following format (YYYY-MM-DD) > ");
		String birth = scan.next();
		birth = birth.trim();
		System.out.println("Your date of birth is " + birth);

		Date date = new Date();
		
		int annual = date.getYear()+1900;
		int monthly = date.getMonth()+1;
		int daily = date.getDay()+1;
		int daysLeft, daysPast;
		
		String year = birth.substring(0,4);
		int yearInt = Integer.parseInt(year);
		String month = birth.substring(5,7);
		int monthInt = Integer.parseInt(month);
		String day = birth.substring(8);
		int dayInt = Integer.parseInt(day);

		if (monthInt < monthly) {
			System.out.println("\nYou are currently " + (annual-yearInt) + " years old!");
			if (dayInt > daily) {
				daysPast = (dayInt-daily) - (monthly-monthInt)*31;
				System.out.println("Your birthday was " + Math.abs(daysPast) + " days ago...");
			} else if (dayInt <= daily) {
				daysPast = (daily-dayInt) - (monthly-monthInt)*31; 
				System.out.println("Your birthday was " + Math.abs(daysPast) + " days ago...");
			} 
		} else if (monthInt > monthly) {
			System.out.println("You are currently " + ((annual-yearInt)-1) + " years old!");
			if (dayInt > daily) {
				daysLeft = (dayInt-daily) + (monthInt-monthly)*31;
				System.out.println("Your birthday is in " + daysLeft + " days!");
			} else if (dayInt < daily) {
				daysLeft = (daily-dayInt) + (monthInt-monthly)*31;
				System.out.println("Your birthday is in " + daysLeft);
			}
		} else if (monthInt == monthly){
			if (dayInt == daily) {
				System.out.println("Today is your birthday! HAPPY BIRTHDAY!!!");	
			} else if (dayInt > daily) {
				daysLeft = dayInt-daily;
				System.out.println("Your birthday was " + daysLeft + " day(s) ago...");
			} else if (dayInt < daily) {
				daysPast = daily-dayInt;
				System.out.println("Your birthday is in " + daysPast + " day(s)!!!");
			}
			
		}





	}
}