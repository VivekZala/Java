/*
 * 	Pattern - 6
 * 		01
 * 		02 03
 * 		04 05 06
 * 		07 08 09 10
 * 		11 12 13 14 15
 */

import java.lang.*;
import java.util.*;

class pattern_6 {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int row, count = 1;
		System.out.print("Enter rows: ");
		row = input.nextInt();

		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.format("%02d ", count++);
			}
			System.out.println();
		}
	}
}

