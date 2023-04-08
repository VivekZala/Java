import java.lang.*;
import java.util.*;

class day_from_day_number {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int day_Number;
		System.out.print("Enter day number: ");
		day_Number = input.nextInt();

		if(day_Number == 1)
			System.out.println("Monday");
		else if(day_Number == 2)
			System.out.println("Tuesday");
		else if(day_Number == 3)
			System.out.println("Wednesday");
		else if(day_Number == 4)
			System.out.println("Thursday");
		else if(day_Number == 5)
			System.out.println("Friday");
		else if(day_Number == 6)
			System.out.println("Saturday");
		else if(day_Number == 7)
			System.out.println("Sunday");
		else 
			System.out.println("Invalid day number");
	}
}

