/*
 *	AP = a + ad + a2d + a3d + ........
 *		Where, 
 *			a = starting term.
 *			d = common difference.
 */

import java.lang.*;
import java.util.*;

class arithmetic_progresstion_series {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int starting_term, common_difference, number_of_terms, series = 0;

		System.out.print("Enter starting term: ");
		starting_term = input.nextInt();
		System.out.print("Enter common difference: ");
		common_difference = input.nextInt();
		System.out.print("Enter number of terms: ");
		number_of_terms = input.nextInt();
		
		System.out.print("Arithmetic progression series is ");
		for(int i = 0; i < number_of_terms; i++) {
			System.out.print(starting_term + " ");
			starting_term += common_difference;
		}
		System.out.println();
	}
}
