import java.lang.*;
import java.util.*;

class left_rotating_array {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int size;
		System.out.print("Enter size of array: ");
		size = input.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter array elements: ");
		for(int i = 0; i < arr.length; i++)
			arr[i] = input.nextInt();
		System.out.print("Array elements are: ");
		for(int x: arr)
			System.out.print(x + " ");
		System.out.println();
		int temp = arr[0];
		/*
		 * for(int i = 1; i < arr.length; i++)
		 * 	arr[i - 1] = arr[i];
		 */
		for(int i = 0; i < arr.length - 1; i++)
			arr[i] = arr[i + 1];
		arr[arr.length - 1] = temp;
		System.out.print("Array elements after left rotation: ");
		for(int x: arr)
			System.out.print(x + " ");
		System.out.println();
	}
}

