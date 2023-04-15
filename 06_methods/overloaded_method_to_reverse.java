import java.lang.*;

class overloaded_method_to_reverse {

	static int reverse(int number) {
		int digit, reversed = 0;
		while(number > 0) {
			digit = number % 10;
			reversed = (reversed * 10) + digit;
			number /= 10;
		}
		return reversed;
	}

	static int[] reverse(int arr[]) {
		int temp[] = new int[arr.length];

		for(int i =  arr.length - 1, j = 0; i >= 0; i--, j++)
			temp[j] = arr[i];

		return temp;
	}

	public static void main(String args[]) {

		int number = 12324;
		int arr[] = {12, 3, 4, 56, 34, 6};

		System.out.println("Number is " + number);
		System.out.print("Array elements are ");
		for(int x: arr)
			System.out.print(x + " ");
		System.out.println();

		System.out.println("Reversed number is " + reverse(number));
		System.out.print("Reversed array elements are ");
		arr = reverse(arr);
		for(int x : arr)
			System.out.print(x + " ");
		System.out.println();
	}
}

