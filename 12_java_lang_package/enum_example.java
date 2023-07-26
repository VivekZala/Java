class enum_example {

	public static void main(String ...args) {

		Dept d = Dept.CIVIL;
		System.out.println();
		System.out.println(d);
		System.out.println();
	}
}

enum Dept {
	CS, IT, CIVIL, ECE;
	
	// Constructor can be private or default.
	// Constructor will execute when enum will loaded for all it's value.
	private Dept() {
		System.out.println(this.name());
	}
}
