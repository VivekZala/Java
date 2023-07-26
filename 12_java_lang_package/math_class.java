class math_class {

	public static void main(String ...args) {

		System.out.println("Absolute");
		System.out.println(Math.abs(-123));
		System.out.println(StrictMath.abs(123));
		System.out.println();

		System.out.println("Cube root");
		System.out.println(Math.cbrt(27));
		System.out.println();

		System.out.println("Exact Decrement");
		System.out.println(Math.decrementExact(7));
		System.out.println();

		System.out.println("Exponent value in floating point representation");
		System.out.println(Math.getExponent(123.45));
		System.out.println();

		System.out.println("Round division");
		System.out.println(Math.floorDiv(50, 9));
		System.out.println();

		System.out.println("e power x");
		System.out.println(Math.exp(1));
		System.out.println(StrictMath.exp(1));
		System.out.println();

		System.out.println("Log base 10");
		System.out.println(Math.log10(100));
		System.out.println();

		System.out.println("Maximum");
		System.out.println(Math.max(150, 50));
		System.out.println();

		System.out.println("Tan");
		System.out.println(Math.tan(45 * Math.PI / 180));
		System.out.println();

		System.out.println("Random");
		System.out.println(Math.random() * 10);
		System.out.println();

		System.out.println("Power");
		System.out.println(Math.pow(2, 3));
		System.out.println();

		System.out.println("Exact product");
		System.out.println(Math.multiplyExact(100, 200));
		System.out.println();

		System.out.println("Next float value");
		System.out.println(Math.nextAfter(12.5, 13));
		System.out.println();
	}
}
