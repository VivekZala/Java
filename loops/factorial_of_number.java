import java.lang.*;
import java.util.*;

class factorial_of_number {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int number, factorial = 1;

		System.out.print("Enter a number: ");
		number = input.nextInt();

		for(int i = 1; i <= number; i++)
			factorial *= i;
		System.out.println(number + "! = " + factorial);
	}
}

