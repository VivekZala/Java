/*
 * 	Pattern - 2
 * 		1 1 1 1 1
 * 		2 2 2 2 2
 * 		3 3 3 3 3
 * 		4 4 4 4 4
 */

import java.lang.*;
import java.util.*;

class pattern_2 {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int row;
		System.out.print("Enter rows: ");
		row = input.nextInt();

		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= row; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}

