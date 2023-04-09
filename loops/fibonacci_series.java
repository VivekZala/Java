/*
 * 	fibonacci(n) = fibonacci(n - 2) + fibonacci(n - 1)
 */

import java.lang.*;
import java.util.*;

class fibonacci_series {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int number, a = 0, b = 1, c = 0;
		System.out.print("Enter a number: ");
		number = input.nextInt();
		System.out.print(a + " " + b + " ");
		for(int i = 0; i < number - 2; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
		System.out.println();
	}
}


