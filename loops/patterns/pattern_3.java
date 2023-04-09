/*
 * 	Pattern - 3
 * 		2 3 4 5 6
 * 		3 4 5 6 7
 * 		4 5 6 7 8
 * 		5 6 7 8 9
 * 		6 7 8 9 10
 */

import java.lang.*;
import java.util.*;

class pattern_3 {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int row, column;
		System.out.print("Enter row: ");
		row = input.nextInt();
		System.out.print("Enter columns: ");
		column = input.nextInt();

		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= column; j++) {
				System.out.print((i + j) + " ");
			}
			System.out.println();
		}
	}
}

