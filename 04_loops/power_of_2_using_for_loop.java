import java.lang.*;
import java.util.*;

class power_of_2_using_for_loop {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		
		int number;
		System.out.print("Enter a number: ");
		number = input.nextInt();

		for(int i = 1; i <= number; i *= 2)
			System.out.println(i);
	}
}

