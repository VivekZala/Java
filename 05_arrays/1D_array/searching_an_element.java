import java.lang.*;
import java.util.*;

class searching_an_element {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int size;
		System.out.print("Enter size of array: ");
		size = input.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter array elements: ");
		for(int i = 0; i < arr.length; i++)
			arr[i] = input.nextInt();

		System.out.print("Array elements are: ");
		for(int x: arr)
			System.out.print(x + " ");
		System.out.println();
		
		int key;
		System.out.print("Enter key to search: ");
		key = input.nextInt();

		/*
		 * for(int i = 0; i < arr.length; i++) {
		 * 	if(arr[i] == key) {
		 * 		System.out.println("Element found at " + i + " location");
		 * 		break;
		 * 	}
		 */
		for(int x: arr) {
			if(x == key) {
				System.out.println("Element found");
				break;
			}
		}
	
	}
}


