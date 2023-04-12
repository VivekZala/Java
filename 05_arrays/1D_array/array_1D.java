import java.lang.*;
import java.util.*;

class array_1D {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int size;
		System.out.print("Enter the size of array: ");
		size = input.nextInt();

		int arr[] = new int[size];
		/*
		 * int arr[] = {10, 20, 30, 40, 50};
		 *
		 * int arr[];
		 * arr = new int[10];
		 *
		 * int[] arr = new int[5];
		 *
		 * int[] a, b, c, d; // all are 1 dimensional array references.
		 *
		 */
		System.out.println("Enter array elements: ");
		for(int i = 0; i < arr.length; i++) 
			arr[i] = input.nextInt();
		System.out.println("Array elements are: ");
		for(int x: arr)
			System.out.print(x + " ");
		System.out.println();
	}
}

