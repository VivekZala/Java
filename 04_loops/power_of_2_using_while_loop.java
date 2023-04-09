import java.lang.*;
import java.util.*;

class power_of_2_using_while_loop {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int number;
		System.out.print("Enter a number: ");
		number = input.nextInt();

		while(number < 100) {
			System.out.println(number);
			number *= 2;
		}
	}
}

