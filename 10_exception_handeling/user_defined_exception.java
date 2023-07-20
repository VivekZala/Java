class user_defined_exception {

	static void fun1() {

		try {
			throw new LowBalanceException();
		} catch(LowBalanceException error) {
			System.out.println(error);
		}
	}
	static void fun2() {
		fun1();
	}
	static void fun3() {
		fun2();
	}
	public static void main(String ...args) {
		fun3();
	}
}
class LowBalanceException extends Exception {
	
	// Over-riding method.
	public String toString() {
		return "Minimum balance should not be less than 5000";
	}


}