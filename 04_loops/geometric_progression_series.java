/*
 * 	GP = a + ar + ar^2 + ar^3 + ........
 * 		Where,
 * 			a = starting term.
 * 			r = ration.
 */
import java.lang.*;
import java.util.*;

class geometric_progression_series {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int starting_term, ratio, number_of_terms;

		System.out.print("Enter starting term: ");
		starting_term = input.nextInt();
		System.out.print("Enter ratio: ");
		ratio = input.nextInt();
		System.out.print("Enter number of terms: ");
		number_of_terms = input.nextInt();

		System.out.print("Geometric progression series is ");
		for(int i = 0; i < number_of_terms; i++) {
			System.out.print(starting_term + " ");
			starting_term *= ratio;
		}
		System.out.println();
	}
}
