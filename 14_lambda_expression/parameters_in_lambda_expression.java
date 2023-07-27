class parameters_in_lambda_expression {

	public static void main(String ...args) {
		/*
		 * MyLambda m = (s) -> { System.out.println(s);};
		 * m.display("Hello world");
		 */

		/*
		 * MyLambda m = (a, b) -> { return a + b; }; // No need to type return.
		 * System.out.println(m.add(20, 30));
		 */

		MyLambda m = (a, b) -> a + b;
		int r = m.add(20, 30);
		System.out.println(r);
	}
}
@FunctionalInterface
interface MyLambda {

	// public void display(String str);
	public int add(int x, int y);
}
