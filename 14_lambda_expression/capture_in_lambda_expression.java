class capture_in_lambda_expression {

	public static void main(String ...args) {
		
		random r = new random();
		r.method1();
	}
}

interface MyLambda {

	public void display();
}

class UseLambda {

	public void callLambda(MyLambda ml) {
		
		ml.display();
	}
}

class random {

	public void method1() {

		UseLambda ul = new UseLambda();
		ul.callLambda( () -> { System.out.println("Hello world"); } );
		/*
		 * int temp = 10;
		 * public void method1() {
		 * 	int count = 0;
		 * 	MyLambda ml = () -> {
		 * 		int count = 0;
		 * 		count++; // Cannot modify.
		 * 		int x = 0;
		 * 		System.out.println("Hi");
		 * 		System.out.println("Bye", (++temp)); // Because temp is local to method.
		 * 	};
		 * 	ml.display();
		 */
	}
}
