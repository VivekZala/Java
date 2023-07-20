class user_defined_throw_and_throws_exception {

	static int area(int length, int breadth) throws NegativeDimensionException {

		if(length < 0 || breadth < 0)
			throw new NegativeDimensionException();
		return length * breadth;
	}
	static void meth1() throws NegativeDimensionException {
		System.out.println(area(50, -9));
	}
	public static void main(String ...args) {

		try {
			meth1();
		} catch(NegativeDimensionException error) {
			System.out.println(error);
		}
	}
}
class NegativeDimensionException extends Exception {

	public String toString() {
		return "Dimension should not be negative";
	}
}
