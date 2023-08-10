import java.util.*;

class string_tokenizer {

	public static void main(String ...args) {

		String data = "name=John;address=delhi;country=India;dept=cse";

		StringTokenizer stk = new StringTokenizer(data, "=;");

		String s;
		while(stk.hasMoreTokens()) {
			s = stk.nextToken();
			System.out.println(s);
		}
	}
}
