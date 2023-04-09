import java.lang.*;
import java.util.*;

class day_from_day_number_switch_case {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		int day_Number;

		System.out.print("Enter day number: ");
		day_Number = input.nextInt();

		switch(day_Number) {

			case 1: System.out.println("Monday");
				break;
			
			case 2: System.out.println("Tuesday");
				break;

			case 3: System.out.println("Wednesday");
				break;

			case 4: System.out.println("Thursday");
				break;

			case 5: System.out.println("Friday");
				break;

			case 6: System.out.println("Saturday");
				break;

			case 7: System.out.println("Sunday");
				break;

			default: System.out.println("Invalid day");
				 break;

		}
	}
}

