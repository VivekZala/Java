import java.lang.*;
import java.util.*;

class maximum_of_2_numbers {

	// Static method.
	// static int max(int x, int y) {
	// 	return (x > y) ? x : y;
	// }
	
	// Non-static method.
	int max(int x, int y) {
		return (x > y) ? x : y;
	}

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int a, b;
		System.out.print("Enter a: ");
		a = input.nextInt();
		System.out.print("Enter b: ");
		b = input.nextInt();
		// Calling static method.
		// System.out.println("Maximum of " + a + " and " + b + " is " + max(a, b));

		// Calling non-static method.
		maximum_of_2_numbers m = new maximum_of_2_numbers();
		System.out.println("Maximum of " + a + " and " + b + " is " + m.max(a, b));
	}
}
