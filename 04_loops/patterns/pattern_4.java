/*
 * 	Pattern - 4
 * 		01 02 03 04 05
 * 		06 07 08 09 10
 * 		11 12 13 14 15
 * 		16 17 18 19 20
 * 		2`1 22 23 24 25
 */

import java.lang.*;
import java.util.*;

class pattern_4 {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int row, column, count = 1;
		System.out.print("Etner rows: ");
		row = input.nextInt();
		System.out.print("Enter columns: ");
		column = input.nextInt();

		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= column; j++) {
				System.out.format("%02d ", count++);
			}
			System.out.println();
		}
	}
}

