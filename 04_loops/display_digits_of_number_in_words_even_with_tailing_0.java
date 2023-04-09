import java.lang.*;
import java.util.*;

class display_digits_of_number_in_words_even_with_tailing_0 {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int number, digit;
		String reversed = "";
		System.out.print("Enter a number: ");
		number = input.nextInt();

		while(number > 0) {
			digit = number % 10;
			reversed = reversed + digit;
			number /= 10;
		}
		for(int i = reversed.length() - 1; i >= 0; i--) {
			char c = reversed.charAt(i);
			switch(c) {
				
				case '0': System.out.print("Zero ");
					break;

				case '1': System.out.print("One ");
					break;

				case '2': System.out.print("Two ");
					break;

				case '3': System.out.print("Three ");
					break;

				case '4': System.out.print("Four ");
					break;

				case '5': System.out.print("Five ");
					break;

				case '6': System.out.print("Six ");
					break;

				case '7': System.out.print("Seven ");
					break;

				case '8': System.out.print("Eight ");
					break;

				case '9': System.out.print("Nine ");
					break;

				default: System.out.print("-Invalid- ");
					 break;
			}
		}
		System.out.println();
	}
}

