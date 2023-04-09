import java.lang.*;
import java.util.*;

class sum_of_natural_numbers {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int number, sum = 0;

		System.out.print("Enter a number: ");
		number = input.nextInt();

		for(int i = 0; i <= number; i++)
			sum += i;
		System.out.println("Sum is " + sum);
	}
}

