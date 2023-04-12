import java.lang.*;
import java.util.*;

class right_rotating_array {

	public static void main(String args[]) {

		Scanner input  = new Scanner(System.in);

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
		int temp = arr[arr.length - 1];
		for(int i = arr.length - 1; i > 0; i--)
			arr[i] = arr[i - 1];
		arr[0] = temp;
		System.out.print("Array elements after right rotation: ");
		for(int x: arr)
			System.out.print(x + " ");
		System.out.println();

	}
}


