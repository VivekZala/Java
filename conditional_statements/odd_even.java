import java.lang.*;
import java.util.*;

class odd_even {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int number;
		System.out.print("Enter number: ");
		number = input.nextInt();

		if(number % 2 == 0)
			System.out.println(number + " is even number");
		else
			System.out.println(number + " is odd number");
	}
}
