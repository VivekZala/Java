import java.lang.*;
import java.util.*;

class reverse_a_number {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int number, remainder, reversed = 0;

		System.out.print("Enter a number: ");
		number = input.nextInt();

		while(number > 0) {
			remainder = number % 10;
			reversed = (reversed * 10) + remainder;
			number /= 10;
		}
		System.out.println("Reversed number is " + reversed);
	}
}

