import java.lang.*;
import java.util.*;

class array_2D {

	public static void main(String args[]) {
		
		int arr[][] = new int[3][4];

		int arr2[][] = {{1, 2, 3, 4}, {2, 4, 6, 8}, {3, 5, 7,9}};

		int a[][];
		a = new int[3][4];

		int []b[] = new int[5][5];
		
		int [] e, f[];
		e = new int[5]; // Here e is 1 dimensional array.
		f = new int[5][5]; // f is 2 dimensional array.

		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[0].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		// for each loop.
		for(int x[]: arr2) {
			for(int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}

	}
}

