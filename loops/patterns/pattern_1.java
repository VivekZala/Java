/*
 * 	Pattern - 1
 *
 * 		1 2 3 4 5
 * 		1 2 3 4 5
 * 		1 2 3 4 5
 * 		1 2 3 4 5
 */

import java.lang.*;
import java.util.*;

class pattern_1 {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int row, column;
		System.out.print("Enter rows: ");
		row = input.nextInt();
		System.out.print("Enter columns: ");
		column = input.nextInt();

		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= column; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

