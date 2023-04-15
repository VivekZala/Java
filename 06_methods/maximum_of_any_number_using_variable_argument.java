import java.lang.*;

class maximum_of_any_number_using_variable_argument {

	static int max(int ...x) {
		int maximum = Integer.MIN_VALUE;
		if(x.length == 0) 
			return Integer.MIN_VALUE;
		else {
			for(int i = 0; i < x.length; i++) {
				if(x[i] > maximum)
					maximum = x[i];
			}
		}
		return maximum;
	}

	public static void main(String args[]) {

		System.out.println("Maximum is " + max());
		System.out.println("Maximum is " + max(10));
		System.out.println("Maximum is " + max(12, 34));
		System.out.println("Maximum is " + max(1, 45, 56));
		System.out.println("Maximum is " + max(32, 45, 34, 54));
		System.out.println("Maximum is " + max(12, 56, 67, 8, 56));
		System.out.println("Maximum is " + max(23, 45, 78, 45, 89, 76));
		System.out.println("Maximum is " + max(12, 4, 23, 12, 54, 34, 32));
		System.out.println("Maximum is " + max(new int[]{23, 45, 67, 45, 3, 56, 67, 45}));
	}
}

