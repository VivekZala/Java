import mypack1.values;

class test_main {

	public static void main(String ...args) {

		values v = new values();

		// We cannot access the values of private outside class.
		// We cannot access the values of protected outside a package.
		// We cannot access the values of default outside a package.
		// System.out.println(v.a + v.b + v.c + v.d);

		v.displayA();
		v.displayB();
		v.displayC();
		v.displayD();
	}
}

