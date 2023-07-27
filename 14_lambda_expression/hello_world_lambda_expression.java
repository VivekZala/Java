class hello_world_lambda_expression {

	public static void main(String ...args) {

		/*
		 * MyLambda m = new My();
		 * MyLambda m = new myLambda() {
		 * 	() -> public void display() {
		 * 		System.out.println("Hello world");
		 * 	}
		 * };
		 */
		
		MyLambda m = () -> { System.out.println("Hello world");};
		m.display();
	}
}

@FunctionalInterface
interface MyLambda {

	public void display();
}

/*
 * class My implements MyLambda {
 * 	
 * 	public void display() {
 * 		
 * 		System.out.println("Hello Wrold");
 * 	}
 * }
 */
