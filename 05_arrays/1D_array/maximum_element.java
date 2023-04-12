import java.lang.*;
import java.util.*;

class maximum_element {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int size;
		System.out.print("Enter array size:");
		size = input.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter array elements: ");
		for(int i = 0; i < arr.length; i++) 
			arr[i]  = input.nextInt();
		System.out.print("Array elements are: ");
		for(int x: arr)
			System.out.print(x + " ");
		System.out.println();
		int max = arr[0];
		for(int x: arr) {
			if(x > max) 
				max = x;
		}
		System.out.println("Maximum element is: " + max);
	}
}

