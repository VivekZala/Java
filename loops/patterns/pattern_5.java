/*
 * 	Pattern - 5
 * 		1
 * 		1 2
 * 		1 2 3
 * 		1 2 3 4
 * 		1 2 3 4 5
 */

import java.lang.*;
import java.util.*;

class pattern_5 {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int row;
		System.out.print("Enter rows: ");
		row = input.nextInt();

		for(int i =1; i <= row; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
