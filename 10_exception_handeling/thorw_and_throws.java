class thorw_and_throws {

	static int area(int length, int breadth) throws Exception {

		if(length < 0 || breadth < 0)
			throw new Exception();
		return length * breadth;
	}
	static void meth1() throws Exception {
		System.out.println(area(-10, 5));
	}
	public static void main(String ...args) throws Exception{

		meth1();
	}
}
