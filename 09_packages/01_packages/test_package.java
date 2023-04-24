// import mypack1.package_1;
// import mypack1.package_2;
// import mypack1.inner.package_3;

import mypack1.*;
import mypack1.inner.*;

class test_package {

	public static void main(String ...args) {

		package_1 p1 = new package_1();
		p1.display();

		package_2 p2 = new package_2();
		p2.display();

		package_3 p3 = new package_3();
		p3.display();
	}
}

