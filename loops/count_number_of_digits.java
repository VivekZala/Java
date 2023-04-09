import java.lang.*;
import java.util.*;

class count_number_of_digits {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int number, count = 0;
		System.out.print("Enter a number: ");
		number = input.nextInt();

		while(number > 0) {
			number /= 10;
			count++;
		}
		System.out.println("Total number of digits is " + count);
	}
}

