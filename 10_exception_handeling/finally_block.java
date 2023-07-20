class finally_block {

	static void meth1() {
		try {
			throw new Exception();
		} catch(Exception error) {
			System.out.println(error);
		} finally {
			System.out.println("Final message");
		}
	}

	public static void main(String ...args) {

		meth1();
	}
}

