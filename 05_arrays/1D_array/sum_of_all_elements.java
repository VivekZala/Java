import java.lang.*;
import java.util.*;

class sum_of_all_elements {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int size, sum = 0;
		System.out.print("Enter size of an array: ");
		size = input.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter array elements: ");
		for(int i = 0; i < arr.length; i++)
			arr[i] = input.nextInt();

		System.out.print("Array elements are: ");
		for(int x: arr)
			System.out.print( x + " ");
		System.out.println();
	
		/*
		 * for(int i = 0; i < arr.length; i++)
		 * 	sum += arr[i];
		 */

		for(int x: arr)
			sum += x;
		System.out.println("Sum is " + sum);
	}
}

