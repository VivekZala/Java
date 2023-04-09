import java.lang.*;
import java.util.*;

class positive_negative {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int number;
		System.out.print("Enter number: ");
		number = input.nextInt();
		if(number >= 0)
			System.out.println(number + " is Positive");
		else
			System.out.println(number + " is Negative");

	}
}
