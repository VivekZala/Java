/*
 *	[1, 3, 4, 5]
 *	[1, 2]
 *	[4, 5, 6, 8, 8, 9]
 */

import java.lang.*;
import java.util.*;

class jagged_array {

	public static void main(String args[]) {

		int arr[][];

		arr = new int[3][];
		arr[0] = new int[4];
		arr[1] = new int[2];
		arr[2] = new int[6];

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
		System.out.println();

		for(int x[] : arr) {
			for(int y : x)
				System.out.print(y + " ");
			System.out.println();
		}


	}
}



