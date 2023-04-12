import java.lang.*;
import java.util.*;

class reverse_an_array {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int size;
		System.out.print("Enter array size: ");
		size = input.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter array elements: ");
		for(int i = 0; i < arr.length; i++)
			arr[i] = input.nextInt();
		System.out.print("Array elements are: ");
		for(int x: arr)
			System.out.print(x + " ");
		System.out.println();
		int new_arr[] = new int[size];
		for(int i = arr.length - 1, j = 0; i >= 0; i--, j++)
			new_arr[j] = arr[i];
		System.out.print("Reversed array elements are: ");
		for(int x: new_arr)
			System.out.print(x + " ");
		System.out.println();
	}
}

