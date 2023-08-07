/*
 * Object class can be used for generalization but there is some problem that there is not type safety.
 * We have to specifically typecast it.
 * When typecasting is done compiler is not checking.
 * At run time it will give error.
 */
class generic_using_typecasting {

	public static void main(String ...args) {

		Object obj = new String("Hello");
		String str = (String)obj;
		System.out.println(str);

		// obj = new Integer(10); // This is not allowed.
	}
}
