import java.lang.*;

class rectangle_cuboid {

	public static void main(String ...args) {

		System.out.println("Rectangle");
		rectangle r = new rectangle();
		System.out.println("Area is : " + r.area());
		rectangle r1 = new rectangle(12, 3);
		System.out.println("Area is : " + r1.area());

		System.out.println("Cuboid");
		cuboid c = new cuboid();
		System.out.println("Volume is : " + c.volume());
		cuboid c1 = new cuboid(12, 32, 34);
		System.out.println("Volume is : " + c1.volume());

	}
}

class rectangle {

	double length, breadth;

	rectangle() {
		length = breadth = 1;
	}
	
	rectangle(int length, int breadth) {
		if(length > 0 && breadth > 0) {
			this.length = length;
			this.breadth = breadth;
		} else {
			this.length = 0;
			this.breadth = 0;
		}
	}

	public double area() {
		return length * breadth;
	}
}

class cuboid extends rectangle {

	double height;

	cuboid() {
		height = 1;
	}
	cuboid(int height) {
		if(height > 0)
			this.height = height;
		else
			this.height = 0;
	}
	cuboid(int length, int breadth, int height) {
		super(length, breadth);
		if(height > 0)
			this.height = height;
		else
			this.height = 0;
	}
	double volume() {
		return length * breadth * height;
	}
}

