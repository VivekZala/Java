/*
 * 	Pattern - 7
 * 		1 2 3 4 5
 * 		1 2 3 4
 * 		1 2 3
 * 		1 2
 * 		1
 */

import java.lang.*;
import java.util.*;

class pattern_7 {

	public static void main(String agrs[]) {

		Scanner input = new Scanner(System.in);

		int row;
		System.out.print("Enter rows: ");
		row = input.nextInt();

		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <=row - i + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

