import java.lang.*;
import java.util.*;

class second_largest_element {
	
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int size;
		System.out.print("Enter array size: ");
		size = input.nextInt();
		int arr[] = new int[size];

		System.out.print("Enter array elements: ");
		for(int i = 0; i< arr.length; i++) 
			arr[i] = input.nextInt();
		System.out.print("Array elements are: ");
		for(int x: arr)
			System.out.print(x + " ");
		System.out.println();

		int max = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE; for(int x: arr) {
			if(x > max) {
				max2 = max;
				max = x;
			}
			else if(x > max2)
				max2 = x;
		}
		System.out.println("Maximum element is: " + max);
		System.out.println("Second largest element is: " + max2);
	}
}

