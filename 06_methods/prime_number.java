import java.lang.*;
import java.util.*;

class prime_number {
	static boolean is_prime(int number) {
		for(int i = 2; i < number / 2; i++) {
			if(number % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int number;
		System.out.print("Enter a number: ");
		number = input.nextInt();
		System.out.println(is_prime(number));
	}
}


