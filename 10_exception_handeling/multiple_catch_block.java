class multiple_catch_block{

	public static void main(String ...args) {

		int a[] = {10, 20, 30, 40, 0};

		try {
			int c = a[1] / a[3];
			System.out.println(c);
			System.out.println(a[5]);
		} catch(ArithmeticException e) {
			System.out.println("Denominator should not be 0, try again");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
		System.out.println("Bye");
	}
}
