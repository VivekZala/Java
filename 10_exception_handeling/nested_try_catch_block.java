class nested_try_catch_block {

	public static void main(String ...args) {

		int a[] = {10, 203, 40, 45};
		int b = 5;
		int c = 4;

		try {
			System.out.println("Division is " + (b / c));
			try {
				System.out.println("a[5] is " + a[5]);
			} catch(ArrayIndexOutOfBoundsException error) {
				System.out.println("Invalid index");
			}
		} catch(ArithmeticException error) {
			System.out.println("Denominator should not be 0 while dividing");
		}
	}
}
