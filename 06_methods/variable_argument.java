import java.lang.*;

class variable_argument {

	static void show(int ...x) {
		for(int a : x) 
			System.out.println(a);
		System.out.println();
	}

	static void showList(String ...s) {
		for(int i = 0; i < s.length; i++) 
			System.out.println(i + 1 + ". " + s[i]);
		System.out.println();
	}

	static void showList(int start, String ...s) {
		for(int i = 0; i < s.length; i++) {
			System.out.println(start + ", " + s[i]);
			start++;
		}
		System.out.println();
	}
	
	public static void main(String args[]) {

		show();
		show(10);
		show(10, 20);
		show(10, 20, 30);
		show(10, 20, 30, 40);
		show(new int[]{10, 20, 30, 40, 50}); // anonymus array.
		
		showList("John", "Ajay", "Rohit", "any");
		showList(5, "John", "Ajay", "Rohit", "any");
	}
}

