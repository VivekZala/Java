import java.io.*;

class checked_exception {

	static void fun1() {

		try {
			FileInputStream fi = new FileInputStream("My.txt");
		} catch(Exception error) {
			System.out.println("Something went wrong");
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
