import java.lang.*;
import java.util.*;

class display_digits_of_number_from_last {

	public static void main(String agrs[]) {

		Scanner input = new Scanner(System.in);

		int number, remainder;
		System.out.print("Enter a number: ");
		number = input.nextInt();

		while(number > 0) {
			remainder = number % 10;
			number /= 10;
			System.out.println(remainder);
		}
	}
}

