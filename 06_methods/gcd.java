import java.lang.*;
import java.util.*;

class gcd {

	static int gcd(int m, int n) {
		while(m != n) {
			if(m > n)
				m = m - n;
			if(n > m)
				n = n - m;
		}
		return m;
	}

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int m, n;
		System.out.print("Enter m, n: ");
		m = input.nextInt();
		n = input.nextInt();
		System.out.println("GCD(" + m + ", " + n + ") = " + gcd(m, n));
	}
}

