import java.lang.*;
import java.util.*;

class multiplication_table {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int number;
		System.out.print("Enter a number: ");
		number = input.nextInt();

		for(int i = 1; i <= 10; i++)
			System.out.println(number + " * " + i + " = " + (number * i));
	}
}

