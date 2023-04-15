import java.lang.*;

class method_overloading {

	static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	static float max(float a, float b) {
		return (a > b) ? a : b;
	}
	static int max(int a, int b, int c) {
		return (a > b && a > c) ? a : (c > a && c > b) ? c : b;
	}

	public static void main(String args[]) {

		int a = 10, b = 45, c = 320;
		float d = 23.23f, e = 234.234f;

		System.out.println("Max(" + a + ", " + b + ") = " + max(a, b));
		System.out.println("Max(" + d + ", " + e + ") = " + max(d, e));
		System.out.println("Max(" + a + ", " + b + ", " + c + ") = " + max(a, b, c));
		}
}



